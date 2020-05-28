/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: Administrator.java

Created: 1st May 2020

-------------------------------------------------
*/

 

public class Administrator {
    int test;
    int adminId;
    int universityId;
    String password;
    String firstName;
    String lastName;
    String email;

    //getter and setter methods
    // getX returns a specific value
    // setX sets a specific variable

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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
    public static void main (String[] args){}
}
