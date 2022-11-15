//UC1 As a User need to enter a valid First Name
//UC2 As a User need to enter a valid Last Name
package com.userregistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public void firstName() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name : ");
        String fname=sc.next();
        String regex="[A-Z][a-z]{3}";
        boolean answer = Pattern.matches(regex,fname);
        if (answer) {
            System.out.println(fname + " is valid");
        }
        else {
            System.out.println(fname + " is not valid");
        }
    }

    public void lastName() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter last name : ");
        String lname=sc.next();
        String regex="[A-Z][a-z]{3}";
        boolean answer = Pattern.matches(regex,lname);
        if (answer) {
            System.out.println(lname + " is valid");
        }
        else {
            System.out.println(lname + " is not valid");
        }
    }
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.firstName();
        user.lastName();
    }
}

