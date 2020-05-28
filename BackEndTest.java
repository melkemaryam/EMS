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
        System.out.println("");
        System.out.println("");
        AccountManager.removeTestUser(test2);
        
        
    }

}
