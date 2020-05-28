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
}
