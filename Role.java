/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: Role.java

Created: 1st May 2020

-------------------------------------------------
*/


public class Role {

    //example:
    //1 = student
    //2 = event organiser
    //3 = administator

    private int userId;
    private String firstName;
    private String lastName;
    private int role;
    
    // getter and setter methods
    // getX returns a specific value
    // setX sets a specific variable
    
    public Role() {
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int id) {
        this.userId = userId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getRole() {
        return role;
    }
    
    public void setRoleNum(int role) {
        this.role = role;
    }
    
    public static void main (String[] args){}
}
