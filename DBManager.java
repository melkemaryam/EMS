/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: DBManager.java

Created: 1st May 2020

-------------------------------------------------
*/
import java.nio.file.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import Model.*;


public class DBManager {
    

    // Function name: connect()
    // Task: connects to the DB
    public static Connection connect() {
        Connection conn = null;
        try {
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            String url = ("jdbc:sqlite:" + s + "ribbentrop_molotov.db");
                       
            // create a connection to the database via hybrid-relative address
            conn = DriverManager.getConnection(url);
                    
            } catch (SQLException e ) {
                System.err.print(e.getMessage());
            }
                    
        return conn;      
    }
    
    // Function name: disconnect()
    // Task: disconnects from the DB
    public static Connection disconnect() {
        
        Connection conn = null;
        return conn;
    }

    //main method for DBManager
    public static void main(String[] args) {
    }
}
