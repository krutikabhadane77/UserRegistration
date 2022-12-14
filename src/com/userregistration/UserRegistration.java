//UC1 As a User need to enter a valid First Name
//UC2 As a User need to enter a valid Last Name
//UC3 As a User need to enter a valid email
//UC4 As a User need to follow pre-defined Mobile Format
//UC5 - UC8 As a User need to follow pre-defined password rules
//UC9 Should clear all email samples provided separately
package com.userregistration;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
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

    public void validEmail() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter email : ");
        String email=sc.next();
        String regex="^[A-Za-z0-9+_.-@]+@(.+)$";
        boolean answer = Pattern.matches(regex,email);
        if (answer) {
            System.out.println(email + " is valid");
        }
        else {
            System.out.println(email + " is not valid");
        }
    }

    public void mobileNumber() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobile number : ");
        String number=sc.next();
        String regex="(0|91)?[-\s]?[6-9][0-9]{9}";
        boolean answer = Pattern.matches(regex,number);
        if (answer) {
            System.out.println(number + " is valid");
        }
        else {
            System.out.println(number + " is not valid");
        }
    }
    public void validPassword() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password : ");
        String password=sc.next();
        String regex="((?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%]).{8,20})";
        boolean answer = Pattern.matches(regex,password);
        if (answer) {
            System.out.println(password + " is valid");
        }
        else {
            System.out.println(password + " is not valid");
        }
    }


    ArrayList<String> emails=new ArrayList<>();
    public void validEmailSamples(){
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");
        String regex="[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern=Pattern.compile(regex);
        for(int i=0;i<emails.size();i++){
            Matcher matcher=pattern.matcher(emails.get(i));
            System.out.println(emails.get(i)+"->"+matcher.matches());
        }
    }
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        user.firstName();
        user.lastName();
        user.validEmail();
        user.mobileNumber();
        user.validPassword();
        user.validEmailSamples();
    }
}

