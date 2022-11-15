//UC1 As a User need to enter a valid First Name
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
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.firstName();
    }
}

