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
    public void addBooking(Student playerOne, int eventID) {
        String sql = "INSERT INTO Bookings(EventID, UserID) VALUES (?,?)";
        
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, eventID);
            pstmt.setInt(2, playerOne.getUserId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print("Something went wrong, Booking was not added to the DB");
        }
        DBManager.disconnect();

        System.out.println("You have successfully booked a spot for this event.");
        //GUI: show message, show in bookingsWindow
    }

    // Function name: cancelBooking()
    // Task: cancels a booking
    public void cancelBooking() {

        System.out.println("You have successfully cancelled a booking.");
        //GUI: show message

    }

    // Function name: viewAllBookings()
    // Task: shows all bookings for certain user
    public ArrayList<Bookings> viewAllBookings(Student playerOne) {
        String sql = "SELECT EventID FROM Bookings WHERE UserID = ?";
        
        int userId = playerOne.getUserId();  
        //need a structure for remembering which user goes into participants in db, a table
        ArrayList<Bookings> eventsList = new ArrayList<>();
        try(Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery(sql);      

            while (rs.next()){
                Bookings allBookings = new Bookings();
                int i = 1;
                allBookings.setEventId(rs.getInt(1));
                eventsList.add(i, allBookings);
                i++;
                }
            
        }catch (SQLException e) {
            System.err.print("No bookings in DB");
        }
        DBManager.disconnect();
        return eventsList;
    }

    // Function name: confirmBooking()
    // Task: confirms a booking
    public void confirmBooking() {
        
        //GUI: show window with ARE YOU SURE? 
        System.out.println("You have successfully confirmed the booking.");
    }
}