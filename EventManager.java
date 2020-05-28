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
    public static void getRoomList() {
        String sql = "SELECT Capacity, RoomNo FROM Rooms";
        
        try (Connection conn = DBManager.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
    
            while (rs.next()){
                System.out.println(rs.getInt("Capacity" + "\t" +
                                    rs.getInt("RoomNo") ));
            }
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
    }
    
    // Function name: addRoom()
    // Task: adds a new room to the DB
    public static void addRoom(int RoomNo, int Capacity) {
        String sql = "INSERT INTO Rooms(Capacity, RoomNo) VALUES (?,?)";
        
        try (Connection conn = DBManager.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, Capacity);
            pstmt.setInt(2, RoomNo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
    
    }
    
    // Function name: createEvent()
    // Task: creates a new event in the system
    public static void createEvent(String EventName, String EventDescription, String EventType, int EventDay, int EventMonth, int EventYear, int EventHour, int EventMinute, Student playerOne, int RoomNo, int Places) {
        String sql = "INSERT INTO Events(EventName, EventDescription, EventDay, EventMonth, EventYear, EventHour, EventType, EventMinute, RoomNo, isNew, isVisible, UserID, Participants) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
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
    public static void cancelEvent(String eventName) {
        String sql = "UPDATE Events SET isVisible=0 WHERE EventName= ?";
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
    public static Events searchEvent(String eventName) {
        String sql = "SELECT EventName, EventDescription, EventDay, EventMonth, EventYear, EventHour, EventMinute, RoomNo, Participants FROM Events WHERE EventName = ?";
        Events specificEvent = new Events();
            try(Connection conn = DBManager.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)){
                    pstmt.setString(1, eventName);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()){
                    specificEvent.setEventName(rs.getString(1));
                    specificEvent.setDescription(rs.getString(2));
                    specificEvent.setEventDay(rs.getInt(3));
                    specificEvent.setEventMonth(rs.getInt(4));
                    specificEvent.setEventYear(rs.getInt(5));
                    specificEvent.setEventHour(rs.getInt(6));
                    specificEvent.setEventMinute(rs.getInt(7));
                    specificEvent.setRoomNo(rs.getInt(8));
                    specificEvent.setEventPlaces(rs.getInt(9));
                }
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();
        return specificEvent;
    }

    // Function name: viewAllEvents()
    // Task: shows all events
    public static ArrayList<String> viewAllEvents() {
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
    public static void editEvent(Events specificEvent) {
        String sql = ("UPDATE Events SET EventDescription=?, EventDay=?, EventMonth=?, EventYear=?, EventHour=?, EventMinute=?, RoomNo=?, Participants=? WHERE EventName=?");
        
            try (Connection conn = DBManager.connect();
                    PreparedStatement pstmt = conn.prepareStatement(sql)){
                pstmt.setString(1, specificEvent.getDescription());
                pstmt.setInt(2, specificEvent.getEventDay());
                pstmt.setInt(3, specificEvent.getEventMonth());
                pstmt.setInt(4, specificEvent.getEventYear());
                pstmt.setInt(5, specificEvent.getEventHour());
                pstmt.setInt(6, specificEvent.getEventMinute());
                pstmt.setInt(7, specificEvent.getRoomNo());
                pstmt.setInt(8, specificEvent.getEventPlaces());
                pstmt.setString(9, specificEvent.getEventName());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.err.print(e.getMessage());
            }
        DBManager.disconnect();
        //GUI: Save button for changes
        System.out.println("You have successfully edited this event.");
        //GUI: show message
    }

    // Function name: viewOwnEvents()
    // Task: with this method the EventOrganiser can view their own events
    public static ArrayList<String> viewOwnEvents(Student playerOne) {
        String sql = "SELECT EventName FROM Events WHERE isVisible = 1 AND UserId = ?";
        ArrayList<String> eventsList = new ArrayList<>();
        try(Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, playerOne.getUserId());
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
    
    public static void DropTestEvent(Events testEvent){
        String sql = "DELETE FROM Events WHERE EventName = ?";
        try(Connection conn = DBManager.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, testEvent.getEventName());
            pstmt.executeUpdate();
        }catch (SQLException e) {
            System.err.print(e.getMessage());
        }
        DBManager.disconnect();    
    }
        //GUI: change of window?
    public static void main(String[] args) {
    }
}
