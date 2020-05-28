/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: Student.java

Created: 1st May 2020

-------------------------------------------------
*/

 

public class Student {

    int userId;
    int universityId;
    String password;
    String firstName;
    String lastName;
    String email;
    int role; 

  
    // getter and setter methods
    // getX returns a specific value
    // setX sets a specific variable

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUniId() {
        return universityId;
    }

    public void setUniId(int universityId) {
        this.universityId = universityId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

   
}
