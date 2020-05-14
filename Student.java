/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: Student.java

Created: 1st May 2020

-------------------------------------------------
*/

 

public class Student {

    int studentId;
    int universityId;
    String password;
    String firstName;
    String lastName;
    String email;
    String role; // same as in EventOrganiser

    //Constructor
    //public Student (int studentId, int universityId, String password, String firstName, String lastName, String email, String role) {

        //this.studentId = studentId;
        //this.universityId = universityId;
        //this.password = password;
        //this.firstName = firstName;
        //this.lastName = lastName;
        //this.email = email;
        //this.role = role;
        
    //}

    //getter and setter methods

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

    public static void main (String [] args) {


    }
}