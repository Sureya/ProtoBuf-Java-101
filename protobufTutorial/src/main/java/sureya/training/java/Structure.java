package sureya.training.java;

import java.util.ArrayList;

/**
 * Created by sks on 27/2/15.
 */
public class Structure {

    public static String firstName,lastName,password;

    public  Structure(){

    }
    public ArrayList<String> getEmailIds() {
        return emailIds;
    }

    public void setEmailIds(ArrayList<String> emailIds) {
        this.emailIds = emailIds;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        Structure.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Structure.lastName = lastName;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Structure.password = password;
    }

    ArrayList<String> emailIds = new ArrayList<String>();



}
