/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: EventManager.java

Created: 1st May 2020

-------------------------------------------------
*/


import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class EventManager {
    
    // Function name: getRoomList()
    // Task: returns a list of room information
    public void getRoomList() {
        String sql = "SELECT RoomID, Capacity, RoomNo FROM Rooms";
        
        try (Connection conn = DBManager.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
    
            while (rs.next()){
                System.out.println(rs.getInt("RoomID") + "\t" +
                                    rs.getInt("Capacity" + "\t" +
                                    rs.getInt("RoomNo") ));
            }
        }catch (SQLException e) {
            System.err.print(e.getMessage());
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
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
    
    }
    
    // Function name: createEvent()
    // Task: creates a new event in the system
    public static void createEvent(String EventName, String EventDescription, String EventType, int EventDay, int EventMonth, int EventYear, int EventHour, int EventMinute, Student playerOne, int RoomNo, int Places) {
        String sql = "INSERT INTO Events(EventName, EventDescription, EventDay, EventMonth, EvetYear, EventHour, EventMinute, RoomNo, isNew, isVisible, UserID, Participants) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
            try (Connection conn = DBManager.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1, EventName);
                pstmt.setString(2, EventDescription);
                pstmt.setInt(3, EventDay);
                pstmt.setInt(4, EventMonth);
                pstmt.setInt(5, EventYear);
                pstmt.setInt(6, EventHour);
                pstmt.setInt(7, EventMinute);
                pstmt.setString(8, EventType);
                pstmt.setInt(9, RoomNo);
                pstmt.setInt(10, 1);
                pstmt.setInt(11, 1);
                pstmt.setInt(12, playerOne.getUserId());
                pstmt.setInt(13, Places);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.err.print(e.getMessage());
            }
        DBManager.disconnect();
    
        System.out.println("You have successfully created this event.");
        //GUI: show message, show in bookingsWindow
        //GUI: show empty window to put values into the empty boxes
    }
    
    // Function name: cancelEvent()
    // Task: cancels and event in the system
    public void cancelEvent(String eventName) {
        String sql = "UPDATE Events isVisible VALUE 0 WHERE EventName= ?";
        Events specificEvent = new Events();
            try (Connection conn = DBManager.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1, eventName);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.err.print(e.getMessage());
            }
        DBManager.disconnect();
        BookingManager.cancelAllBookings(eventName);
        //GUI: ARE YOU SURE? window appears on mouse click
        //System.out.println("You have successfully cancelled the event.");
        //GUI: show message
    }
    
    // Function name: searchEvent()
    // Task: searches for a special event in the DB
    public Events searchEvent(String eventName) {
        String sql = "SELECT EventId, EventDescription, EventDate, StartTime RoomID FROM Events WHERE EventName = ?";
        Events specificEvent = new Events();
            try(Connection conn = DBManager.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)){
                    pstmt.setString(1, eventName);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()){
                    specificEvent.setEventId(rs.getInt(1));
                    specificEvent.setDescription(rs.getString(2));
                    specificEvent.setDate(rs.getString(3));
                    specificEvent.setTime(rs.getFloat(4));
                    specificEvent.setRoomNo(rs.getInt(5));
                }
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
        return specificEvent;
    }

    // Function name: viewAllEvents()
    // Task: shows all events
    public ArrayList<String> viewAllEvents() {
        String sql = "SELECT EventName FROM Events WHERE isVisible = 1";
        ArrayList<String> eventsList = new ArrayList<>();
        try(Connection conn = DBManager.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();      

            while (rs.next()){
                eventsList.add(rs.getString(1));
                }
            
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
        return eventsList;
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
    public ArrayList<Events> viewOwnEvents(Student playerOne) {
        String sql = "SELECT EventId, EventName, EventDescription, EventDate, StartTime RoomID FROM Events WHERE isVisible = 1 AND UserId = ?";
        ArrayList<Events> eventsList = new ArrayList<>();
        try(Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, playerOne.getUserId());
            ResultSet rs = pstmt.executeQuery();      

            while (rs.next()){
                Events allEvents = new Events();
                int i = 1;
                allEvents.setEventId(rs.getInt(1));
                allEvents.setEventName(rs.getString(2));
                allEvents.setDescription(rs.getString(3));
                allEvents.setDate(rs.getString(4));
                allEvents.setTime(rs.getFloat(5));
                allEvents.setRoomNo(rs.getInt(6));
                eventsList.add(i, allEvents);
                i++;
                }
            
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
        return eventsList;
    }
        //GUI: change of window?
    public static void main(String[] args) {
    }
}
