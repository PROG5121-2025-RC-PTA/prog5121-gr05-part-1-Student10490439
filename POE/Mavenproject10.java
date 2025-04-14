/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Mavenproject10 {

    public static void main(String[] args, boolean validationUsername, boolean validationPassword) {
        
        Scanner input = new Scanner(System.in);
        String firstname, lastname, username, password, number;
        
        System.out.println("-----------------------");
        System.out.println("----------Register----------");
        System.out.println("-----------------------");
        
        
        System.out.println("Please enter first name");
        firstname = input.nextLine();
        System.out.println("Please enter last name");
        lastname = input.nextLine();
        System.out.println("Please enter username");
        username = input.nextLine();
        System.out.println("Please enter password");
        password = input.nextLine();
        System.out.println("Please enter cellphone number(with South Africas international code(+27)):");
        number = input.nextLine();
        
        Login login = new Login();
        
        boolean validateNumber = login.checkCellphoneNumber(number);
        boolean validateUsername = login.checkUsername(username);      
        boolean validatePassword = login.checkPasswordComplexity(password);
        
        
        //checks and validates phone number
        if (validateNumber == true){
            System.out.println("Cellphone number successfully added");
        }else {
            System.out.println("Cellphone number incorrectly formated or does not contain international code");
        }
        
        //checks and validates username
        if (validateUsername == true){
            System.out.println("Username successfully captured");
        }else{
            System.out.println("Username is not correctly formatted, please ensure that username contains an underscore and is more then five letters in length");
        }
        
        //checks and vaidates password
        if (validatePassword == true){
            System.out.println("Password successfully captured");
        }else{
            System.out.println("Password incorrectly formtted, please ensure that password contains at least eight characters, a capital and small letter, a number and a specialcharacter");
        }
        boolean validationNumber = false;
        
        if(validateUsername == true & validationNumber == true & validationPassword == true ){
            System.out.println("You have successfully registered");
            String loginUsername;
            String loginPassword;
            
            System.out.println("-----------------------");
            System.out.println("----------Login----------");
            System.out.println("-----------------------");
            
             System.out.println("Enter username: ");
              loginUsername=input.nextLine();
             System.out.println("Enter password: ");
              loginPassword=input.nextLine();
              
              if(loginUsername.equals(username) & loginPassword.equals(password)){
                  System.out.println("Hello" + firstname + "," + lastname + "and welcome");
              }else{
                  System.out.println("Login failed! wrong username or password");
              }
        }else{
            System.out.println("Failed to register");
            main(null);
        }
        
        
    }

    private static void main(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
