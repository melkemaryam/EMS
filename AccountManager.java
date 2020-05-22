/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: AccountManager.java

Created: 1st May 2020

-------------------------------------------------
*/

 

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class AccountManager {

    private static final Logger LOGGER = Logger.getLogger(DBManager.class.getName() );

    private static final DBManager DATABASE = new DBManager();
    
    public AccountManager(){
        //off
        LOGGER.setLevel(Level.ALL);
    }
    
    // Function name: addUser()
    // Task: adds a new user to the DB
    public static void addUser(Student playerOne) {
        String sql = "INSERT INTO Users(FirstName, LastName, Email, UserType, StudentID, password) VALUES (?,?,?,?,?,?)";

        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, playerOne.getFirstName());
            pstmt.setString(2, playerOne.getLastName());
            pstmt.setString(3, playerOne.getEmail());
            pstmt.setInt(4, playerOne.getRole());
            pstmt.setInt(5, playerOne.getUniId());
            pstmt.setString(6, playerOne.getPassword());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.err.print("Something went wrong, User was not added to the DB");
        }
        DBManager.disconnect();
        System.out.println("You have successfully registered.");
    
    }

    // Function name: logIn()
    // Task: logs a user into the system
    public int logIn(Student playerOne) {
        String sql = "SELECT UserID FROM Users WHERE StudentID =? AND password=?";
        int logInStatus = 0;
        int universityId = playerOne.getUniId();    
        String password = playerOne.getPassword();
        try (Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, universityId);
                pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery(sql);

            if (!rs.isBeforeFirst()) {
                System.out.println("Combination of this UniversityID and password does not exist");
                //GUI: show message
            }
            else{
                logInStatus = 1;
                System.out.println("You have successfully logged in.");
                //GUI: show message, and go to default window
            }

        }catch (SQLException e) {
            System.err.print("No DB connection");
        }
        DBManager.disconnect();
        return logInStatus;
    }

    // Function name: logOut()
    // Task: logs a user out of the system
    public int logOut(Student playerOne) {
        int logInStatus = 0;
        System.out.println("You have successfully logged out.");

        //GUI: go from current window back to log in window
    
        return logInStatus;
    }

    // Function name: retrieveUser()
    // Task: method to retrive user information
    public void retrieveUser(Student playerOne) {
        String sql = "SELECT FirstName, LastName, Email, UserType, StudentID FROM Users WHERE UserID =?";
        int universityId = playerOne.getUniId();

        try (Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, universityId);
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()){
                playerOne.setUniId(rs.getInt("StudentID"));
                playerOne.setFirstName(rs.getString("FirstName"));
                playerOne.setLastName(rs.getString("LastName"));
                playerOne.setEmail(rs.getString("Email"));
                playerOne.setRole(rs.getInt("UserType")); 
            }
        }catch (SQLException e) {
            System.err.print("No such user");
        }
        DBManager.disconnect();
    }


    // Function name: grantPermission()
    // Task: grants a student the permission to act as an EventOrganiser
    public void grantPermission(Student playerOne) {
        String sql = "UPDATE Users " + "SET UserType = ? " + "WHERE UserID = ?";
        int userId = playerOne.getUserId();    
        int userType = 2;
        try (Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, userType);
                pstmt.setInt(2, userId);
            ResultSet rs = pstmt.executeQuery(sql);
        }catch (SQLException e) {
            System.err.print("No DB connection");
        }
        DBManager.disconnect();
    }
    
    // Function name: requestPermission()
    // Task: leaves a request in db for the permission to act as an EventOrganiser
    public void requestPermission(Student playerOne) {
        String sql = "UPDATE Users SET roleRequest = 1 " + "WHERE UserID = ?";
        int userId = playerOne.getUserId(); 
        try (Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery(sql);
        }catch (SQLException e) {
            System.err.print("No DB connection");
        }
        DBManager.disconnect();
    }
    
    // Function name: revokeRights()
    // Task: revokes then rights from an EventOrganiser
    public void revokeRights(Student playerOne) {
        String sql = "UPDATE Users " + "SET UserType = ? " + "WHERE UserID = ?";
        int userId = playerOne.getUserId();    
        int userType = 1;
        try (Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, userType);
                pstmt.setInt(2, userId);
            ResultSet rs = pstmt.executeQuery(sql);
        }catch (SQLException e) {
            System.err.print("No DB connection");
        }
        DBManager.disconnect();
    }

    // Function name: retrieveRequests()
    // Task: method to retrive requests for Event Organiser rights
    public ArrayList<Student> retrieveRequests() {
        String sql = "SELECT UserID FROM Users WHERE roleRequest = 1";
        ArrayList<Student> requestsList = new ArrayList<>();
        try (Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            ResultSet rs = pstmt.executeQuery(sql);

            while (rs.next()){
                int i = 1;
                Student playerTwo = new Student();
                playerTwo.setUserId(rs.getInt("StudentID"));
                requestsList.add(i, playerTwo);
                i++;
            }
        }catch (SQLException e) {
            System.err.print("No such user");
        }
        DBManager.disconnect();
        return requestsList;
    }
}