package org.example;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        scanner.close();
        System.out.println(passwordValidation(password));
    }
    public static boolean passwordValidation(String password){
        if(passwordLength(password) == true && passwordContainsDigits(password) == true && passwordUpperCaseLetters(password) == passwordDoNotUse(password)){
            System.out.println("Your password is valid.");
            return true;}
        else {
            return false;
        }
    }
    public static boolean passwordLength(String password) {
        if (password.length() >= 8) {
            return true;
        } else {
            System.out.println("The password must be at least 8 characters");
            return false;
        }
    }

    public static boolean passwordContainsDigits(String password){
        char[] checkForNumbers = password.toCharArray();
        for (char n: checkForNumbers){
            if (Character.isDigit(n)){
                return true;
            }
        }
        System.out.println("The password must contain at least one number");
        return false;
    }

    public static boolean passwordUpperCaseLetters(String password) {
        char[] checkForUpperCase = password.toCharArray();
        for (char uc : checkForUpperCase) {
            if (Character.isUpperCase(uc)) {
                return true;
            }
        }
        System.out.println("The password must contain at least one uppercase Letter");
        return false;
    }
    public static boolean passwordDoNotUse(String password) {
        String str1 = "Password123";

        String str2 = "P1234567";

        if (password.equals(str1) || password.equals(str2)) {
            System.out.println("The Password is not secure enough.");
            return false;
        }
        return true;
    }
}