/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: Bookings.java

Created: 1st May 2020

-------------------------------------------------
*/

 

public class Bookings {

    int bookingId;
    int eventId;
    int userId;
    String status; 

    
    // getter and setter methods
    // getX returns a specific value
    // setX sets a specific variable

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   
}
