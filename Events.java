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
    String category;
    String date;
    float time;
    String location;
    int roomNo;
    String place;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean getBookReq() {
        return bookingRequired;
    }

    public void setBookReq(boolean bookingRequired) {
        this.bookingRequired = bookingRequired;
    }

    public static void main (String[] args){}
    
}