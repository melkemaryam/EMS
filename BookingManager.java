/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: BookingManager.java

Created: 1st May 2020

-------------------------------------------------
*/

 


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class BookingManager {

    // Function name: addBooking()
    // Task: adds a new booking to the DB
    public static void addBooking(Student playerOne, int eventID) {
        String sql = "INSERT INTO Bookings(EventID, UserID) VALUES (?,?)";
        
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, eventID);
            pstmt.setInt(2, playerOne.getUserId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();

        System.out.println("You have successfully booked a spot for this event.");
        //GUI: show message, show in bookingsWindow
    }

    // Function name: cancelBooking()
    // Task: cancels a booking
    public static void cancelBooking(Student playerOne, int eventId) {
        String sql = "DELETE FROM Bookings WHERE EventID = ? AND UserID = ?";
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, eventId);
            pstmt.setInt(2, playerOne.getUserId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
        
        System.out.println("You have successfully cancelled a booking.");
        //GUI: show message

    }
    
    // Function name: adminCancelBooking()
    // Task: cancels a booking
    public static void adminCancelBooking(int bookingId) {
        String sql = "DELETE FROM Bookings WHERE BookingID = ?";
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, bookingId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
        
        System.out.println("You have successfully cancelled a booking.");
        //GUI: show message

    }    
    // Function name: cancelAllBookings()
    // Task: cancels an event connected bookings
    public static void cancelAllBookings(String eventName) {
        String sql = "DELETE FROM Bookings WHERE EventName = ?";
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, eventName);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
    }

    // Function name: viewUserBookings()
    // Task: shows all bookings for certain user
    public ArrayList<String> viewUserBookings(Student playerOne) {
        String sql = "SELECT EventID FROM Bookings WHERE UserID = ?";
        
        int userId = playerOne.getUserId();  
        //need a structure for remembering which user goes into participants in db, a table
        ArrayList<String> eventsList = new ArrayList<>();
        try(Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();      

            while (rs.next()){
                eventsList.add(rs.getString(1));
                }
            
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
        return eventsList;
    }
    
    // Function name: viewAllBookings()
    // Task: shows all bookings
    public ArrayList<String> viewAllBookings() {
        String sql = "SELECT Booking ID, UserID, EventName FROM Bookings";
        
        ArrayList<String> bookingsList = new ArrayList<>();
        try(Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            ResultSet rs = pstmt.executeQuery();      

            while (rs.next()){
                bookingsList.add(rs.getInt(1) + " - " +rs.getInt(2) + " - " +rs.getString(3));
                }
            
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
        return bookingsList;
    }
    
    // Function name: confirmBooking()
    // Task: confirms a booking
    public void confirmBooking() {
        
        //GUI: show window with ARE YOU SURE? 
        System.out.println("You have successfully confirmed the booking.");
    }
}