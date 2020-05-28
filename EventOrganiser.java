/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: EventOrganiser.java

Created: 1st May 2020

-------------------------------------------------
*/

 

public class EventOrganiser { 

    int studentId;
    int universityId;
    String password;
    String firstName;
    String lastName;
    String email;
    String role; 


    
    // getter and setter methods
    // getX returns a specific value
    // setX sets a specific variable

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
