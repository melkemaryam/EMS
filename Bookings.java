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
    String status; // or int status if every status has a number: e.g. 1 = cancelled, etc...

    //Constructor
    //public Bookings(int bookingId, int dateOfBooking, String status){

        //this.bookingId = bookingId;
        //this.dateOfBooking = dateOfBooking;
        //this.status = status;
    //}

    //getter and setter methods

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

    public static void main (String[] args){

    }
}