/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: Role.java

Created: 1st May 2020

-------------------------------------------------
*/

//hello 

public class Role {

    //example:
    //1 = student
    //2 = event organiser
    //3 = administator

    private int id;
    private String firstName;
    private String lastName;
    private int roleNum;
    
    public Role() {
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    
    public int getRoleNum() {
        return roleNum;
    }
    
    public void setRoleNum(int roleNum) {
        this.roleNum = roleNum;
    }
    
    
}