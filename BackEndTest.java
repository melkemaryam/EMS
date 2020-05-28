/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: BackEndTest.java

Created: 28th May 2020

-------------------------------------------------
*/
import java.util.ArrayList;

public class BackEndTest
{
    int bookingId;
    int eventId;
    int userId;
    int universityId;
    String password;
    String firstName;
    String lastName;
    String email;
    int role;
    int roomNo;
    String roomAddress;
    int capacity;
    int uniId;
    String eventName;
    String description;
    String category;
    String date;
    float time;
    String location;
    String place;
    boolean bookingRequired;
    
    public static void main (String args[]){
        
        System.out.println("This is test class to go through all the methods that are supposed to pass and retrieve data to/from DB");
        System.out.println("First element is creating a user - for this the addUser method of AccountManager will be called");
        System.out.println("The values will be set as First Name A, Last Name B, email E@mail.com, UniversityID 123, password qwe, Role 1");
        String firstName = "A";
        String lastName = "B";
        String email = "E@mail.com";
        int universityId = 123;
        String password = "qwe";
        int role = 1;
        System.out.println("The values are now:" + firstName + " " + lastName + " " + email + " " + universityId + " " + password + " " + role + ".");
        System.out.println("The values will now be transferred to a new Student class object");
        Student test = new Student();
        test.setFirstName(firstName);
        test.setLastName(lastName);
        test.setEmail(email);
        test.setUniId(universityId);
        test.setPassword(password);
        test.setRole(role);
        System.out.println("The student object values will now be passed to DB to save user for future use using method from AccountManager addUser() which takes Student object as an argument");
        AccountManager.addUser(test);
        System.out.println("New Student object will now be created with no default values");
        Student test2 = new Student();
        System.out.println("This new object will now retrieve the values from DB using UniversityID - which is used for logging in, so UniversityID will be set to the previous value of 123");
        test2.setUniId(123);
        AccountManager.retrieveUser(test2);
        System.out.println("The values are now:" + test2.getFirstName() + " " + test2.getLastName() + " " + test2.getEmail() + " " + test2.getRole() + ".");
        System.out.println("Should the user request Event Organiser rights the method called will change value for roleRequest() field in DB from 0 to 1. This is done by AccountManager method requestPermission which takes Student object as an argument");
        AccountManager.requestPermission(test2);
        System.out.println("This can then be seen on administrator end with a method that fetches role change requests from AccountManager class called retrieveRequests()");
        ArrayList<Integer> requestsList = AccountManager.retrieveRequests();
        StringBuilder sb = new StringBuilder();
            for (int i = requestsList.size() - 1; i >= 0; i--){
                int num = requestsList.get(i);
                sb.append(num);
            }
        System.out.println("Requests by UniID can be seen here: " + sb.toString());
        System.out.println("That request can be resolved by using method grantRights() form Account Manager");
        AccountManager.grantPermission(test2.getUniId());
        AccountManager.retrieveUser(test2);
        System.out.println("The result is the field Role now being " + test2.getRole() + ".");
        System.out.println("Those rights can be revoked using method revokeRights() from AccountManager class");
        AccountManager.revokeRights(test2.getUniId());
        AccountManager.retrieveUser(test2);
        System.out.println("This results in field Role now being " + test2.getRole() + ".");
        System.out.println("That concluded AccountManager methods, moving on to EventManager. The key method of entire program is creating an Event");
        System.out.println("For creation of events 10 values get put into DB and 3 will be set automatically - one value from Student object and two fields with default values");
        String eventName = "Test event";
        String description = "Test description";
        int eventDay = 01;
        int eventMonth = 01;
        int eventYear = 01;
        int eventHour = 01;
        int eventMinute = 01;
        String eventType = "physical";
        int roomNo = 1;
        int places = 60;
        System.out.println("The values insterted into the database are as follows: " + eventName + " " + description + " " + eventDay + " " + eventMonth + " " + eventYear + " " + eventType + " " + roomNo + " " + places + ".");
        EventManager.createEvent(eventName, description, eventType, eventDay, eventMonth, eventYear, eventHour, eventMinute, test2, roomNo, places);
        System.out.println("Now to call on DB searching for events the method viewAllEvents() is called which should return Test event among any being in the DB at the time.");
        ArrayList<String> eventList = EventManager.viewAllEvents();
        StringBuilder se = new StringBuilder();
            for (int i = eventList.size() - 1; i >=0; i--){
                String event = eventList.get(i);
                se.append(event);
            }
        System.out.println("The events found are:" + se);        
        System.out.println("To get details of an event method searchEvents() is used, it will accept String eventname and return event object with data retrieved.");
        Events specificEvent = EventManager.searchEvent(eventName);
        System.out.println("Returned values are: " + specificEvent.getEventName() + " -name " + specificEvent.getDescription() + " -description " + specificEvent.getEventDay() + " " + specificEvent.getEventMonth() + " " + specificEvent.getEventYear() + " - date " + specificEvent.getEventHour() + " " + specificEvent.getEventMinute() + " - time " + specificEvent.getEventPlaces() + " - max participants " + specificEvent.getRoomNo() + " - room number " );
        System.out.println("From that point user can edit the event using editEvent() method changing desciption and start time");
        specificEvent.setDescription("A new testive-festive description");
        specificEvent.setEventHour(22);
        specificEvent.setEventMinute(22);
        EventManager.editEvent(specificEvent);
        System.out.println("Now a new Event object will be set up and read the updated values for Test Event");
        Events testEvent = EventManager.searchEvent(eventName);
        System.out.println("Returned values are: " + testEvent.getEventName() + " -name " + testEvent.getDescription() + " -description " + testEvent.getEventDay() + " " + testEvent.getEventMonth() + " " + testEvent.getEventYear() + " - date " + testEvent.getEventHour() + " " + testEvent.getEventMinute() + " - time " + testEvent.getEventPlaces() + " - max participants " + testEvent.getRoomNo() + " - room number " );          
        System.out.println("Another method will show only Events which are created by logged in User ");
        ArrayList<String> shortList = EventManager.viewOwnEvents(test2);
        StringBuilder sl = new StringBuilder();
            for (int i = shortList.size() - 1; i >=0; i--){
                String event = shortList.get(i);
                sl.append(event);
            }
        System.out.println("The events found are:" + sl);
        System.out.println("Then there is cancelEvent() method which changes event visibility to 0, so I will not be searchable");
        EventManager.cancelEvent(testEvent.getEventName());
        System.out.println("Now to make sure the list will be called once again and should not show Test Event");
        ArrayList<String> testList = EventManager.viewAllEvents();
        StringBuilder sa = new StringBuilder();
            for (int i = testList.size() - 1; i >=0; i--){
                String event = testList.get(i);
                sa.append(event);
            }
        System.out.println("The events found are:" + sa);  
        System.out.println("Last Manager Class is BookingManager");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        AccountManager.removeTestUser(test2);
        
        
    }

}
