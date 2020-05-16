/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: Rooms.java

Created: 16th May 2020

-------------------------------------------------
*/

 

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Rooms{
    private int roomNo;
    private String roomAddress;
    private int capacity;
    // Function name: retrieveRooms()
    // Task: method to retrive rooms information
    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Rooms> retrieveRooms() {
        String sql = "SELECT * FROM Rooms";
        ArrayList<Rooms> roomsList = new ArrayList<>();
        try{
            Connection conn = DBManager.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);      

            while (rs.next()){
                Rooms aRoom = new Rooms();
                int i = 1;
                aRoom.setRoomNo(rs.getInt(1));
                aRoom.setRoomAddress(rs.getString(2));
                aRoom.setCapacity(rs.getInt(3));
                roomsList.add(i, aRoom);
                i++;
                }
            
        }catch (SQLException e) {
            System.err.print("No rooms in DB");
        }
        DBManager.disconnect();
        return roomsList;
    }
    
}