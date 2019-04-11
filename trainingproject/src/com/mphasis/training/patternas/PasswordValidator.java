package com.mphasis.training.patternas;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class PasswordValidator {
 
    private Pattern pattern;
    private Matcher matcher;
 
    private static final String PASSWORD_PATTERN = 
    		"((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,10})";
 
    public PasswordValidator() {
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }
 
    public boolean validate(final String password) {
 
        matcher = pattern.matcher(password);
        return matcher.matches();
 
    }
    public static void main(String args[]) {
    	PasswordValidator pasd=new PasswordValidator();
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
		String s=sc.next();
    	System.out.println(pasd.validate(s));
    }
}