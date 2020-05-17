/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: EventManager.java

Created: 1st May 2020

-------------------------------------------------
*/

 

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class EventManager {

    // Function name: getRoomList()
    // Task: returns a list of room information
    public void getRoomList() {
        String sql = "SELECT RoomID, RoomNo, Size FROM Rooms";
        
        try (Connection conn = DBManager.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){

            while (rs.next()){
                System.out.println(rs.getInt("RoomID") + "\t" +
                                    rs.getInt("RoomNo") + "\t" +
                                    rs.getInt("Size"));
            }
        }catch (SQLException e) {
            System.err.print("Problem with DB connection");
        }
        DBManager.disconnect();
    }

    // Function name: addRoom()
    // Task: adds a new room to the DB
    public void addRoom(String Address, int RoomNo, int Size) {
        String sql = "INSERT INTO Users(Address, RoomNo, Size) VALUES (?,?,?)";
        
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, RoomNo);
            pstmt.setInt(2, Size);
            pstmt.setString(3, Address);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print("Something went wrong, Room was not added to the DB");
        }
        DBManager.disconnect();
    
    }

    // Function name: createEvent()
    // Task: creates a new event in the system
    public void createEvent(String EventName, String EventDescription, int EventDate, float StartTime, float EndTime, int UserID, int RoomID) {
        String sql = "INSERT INTO Events(EventName, EventDescription, EventDate, StartTime, EndTime, UserID, RoomID, isNew, isVisible) VALUES (?,?,?,?,?,?,?,?)";
        
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, EventName);
            pstmt.setString(2, EventDescription);
            pstmt.setInt(3, EventDate);
            pstmt.setFloat(4, StartTime);
            pstmt.setFloat(5, EndTime);
            pstmt.setInt(6, UserID);
            pstmt.setInt(7, RoomID);
            pstmt.setInt(8, 1);
            pstmt.setInt(9, 1);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print("Something went wrong, Event was not added to the DB");
        }
        DBManager.disconnect();

        System.out.println("You have successfully created this event.");
        //GUI: show message, show in bookingsWindow
        //GUI: show empty window to put values into the empty boxes
    }

    // Function name: cancelEvent()
    // Task: cancels and event in the system
    public void cancelEvent() {

        //GUI: ARE YOU SURE? window appears on mouse click
        System.out.println("You have successfully cancelled the event.");
        //GUI: show message
    }

    // Function name: searchEvent()
    // Task: searches for a special event in the DB
    public void searchEvent() {

    }

    // Function name: viewAllEvents()
    // Task: shows all events
    public void viewAllEvents() {

    }

    // Function name: editEvent()
    // Task: edits an already existing event in the DB
    public void editEvent() {
        //GUI: make window editable
        //GUI: Save button for changes
        System.out.println("You have successfully edited this event.");
        //GUI: show message
    }

    // Function name: viewOwnEvents()
    // Task: with this method the EventOrganiser can view their own events
    public void viewOwnEvents() {
        //GUI: change of window?
    }




}