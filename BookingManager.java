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
import java.sql.PreparedStatement;

public class BookingManager {

    // Function name: addBooking()
    // Task: adds a new booking to the DB
    public void addBooking(String EventName, String EventDescription, int EventDate, float StartTime, float EndTime, int UserID, int RoomID, int isNew, int isVisible) {
        String sql = "INSERT INTO Bookings(EventName, EventDescription, EventDate, StartTime, EndTime, UserID, RoomID, isNew, isVisible) VALUES (?,?,?,?,?,?,?,?)";
        
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, EventName);
            pstmt.setString(2, EventDescription);
            pstmt.setInt(3, EventDate);
            pstmt.setFloat(4, StartTime);
            pstmt.setFloat(5, EndTime);
            pstmt.setInt(6, UserID);
            pstmt.setInt(7, RoomID);
            pstmt.setInt(8, isNew);
            pstmt.setInt(9, isVisible);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print("Something went wrong, Event was not added to the DB");
        }
        DBManager.disconnect();

        System.out.println("You have successfully booked this event.");
        //GUI: show message, show in bookingsWindow
    }

    // Function name: cancelBooking()
    // Task: cancels a booking
    public void cancelBooking() {

        System.out.println("You have successfully cancelled a booking.");
        //GUI: show message

    }

    // Function name: viewAllBookings()
    // Task: shows all bookings
    public void viewAllBookings() {
        //GUI: happens on mouse click, change of window?
    }

    // Function name: confirmBooking()
    // Task: confirms a booking
    public void confirmBooking() {
        
        //GUI: show window with ARE YOU SURE? 
        System.out.println("You have successfully confirmed the booking.");
    }
}