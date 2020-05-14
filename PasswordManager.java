/*
-------------------------------------------------

Project: Eventmanagementsystem
Group: Hexterminators

File name: PasswordManager.java

Created: 1st May 2020

-------------------------------------------------
*/

 

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class PasswordManager {

    // Function name: hashingPassword()
    // Task: hashes a password
    public static String hashingPassword(String passToHash) throws NoSuchAlgorithmException {

        MessageDigest messageDig = MessageDigest.getInstance("SHA-256");
        byte[] messageDigest = messageDig.digest(passToHash.getBytes());
        BigInteger num = new BigInteger(1, messageDigest);

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(num.toString(16));

        while (strBuilder.length() < 32) {
            strBuilder.insert(0, "0");
        }

        return strBuilder.toString();
    }
}
