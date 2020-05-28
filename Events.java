/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: Events.java

Created: 1st May 2020

-------------------------------------------------
*/

 

public class Events {


    int eventId; 
    String eventName;
    String description;
    int day;
    int month;
    int year;
    int minute;
    int hour;
    String location;
    int roomNo;
    int places;
    boolean bookingRequired;
    

    //Constructor
    //public Events(int eventId, String eventName, String description, String category, String date, float time, String location, int roomNumber, String place, boolean bookingRequired){

        //this.eventId = eventId;
        //this.eventName = eventName;
        //this.description = description;
        //this.category = category;
        //this.date = date;
        //this.time = time;
        //this.location = location;
        //this.roomNumber = roomNumber;
        //this.place = place;
        //this.bookingRequired = bookingRequired;
    //}
    
    //getter and setter methods
    
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEventDay() {
        return day;
    }

    public void setEventDay(int day) {
        this.day = day;
    }

    public int getEventMonth() {
        return month;
    }

    public void setEventMonth(int month) {
        this.month = month;
    }
    
    public int getEventYear() {
        return year;
    }

    public void setEventYear(int year) {
        this.year = year;
    }
    
    public int getEventHour() {
        return hour;
    }

    public void setEventHour(int hour) {
        this.hour = hour;
    }
    
    public int getEventMinute() {
        return minute;
    }

    public void setEventMinute(int minute) {
        this.minute = minute;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getEventPlaces() {
        return places;
    }

    public void setEventPlaces(int places) {
        this.places = places;
    }

    public boolean getBookReq() {
        return bookingRequired;
    }

    public void setBookReq(boolean bookingRequired) {
        this.bookingRequired = bookingRequired;
    }

    public static void main (String[] args){}
    
}