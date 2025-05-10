 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject10;

/**
 *
 * @author RC_Student_lab
 */
class Login {
    
    public Login(){
        
    }
    
    public boolean checkUsername (String username){
        
        return username.contains ("_") && username.length() <=5;
    }

    boolean checkCellphoneNumber(String number) {
       
        String saCode = "+27";
        String firstThreeChars = number.substring(0,3);
        
        int fourthDigit = Character.getNumericValue(number.charAt(3));
        return number.length() <=12 && firstThreeChars.equals(saCode) && fourthDigit >=6 && fourthDigit <=8;
    }
    

    boolean checkPasswordComplexity(String password) {
        
        String capital = ".*[A-Z].*";
        String small = ".*[a-z].*";
        String special = ".*[!@#$%^&*(),.?/:{}|<>].*";
        String digit = ".*\\d.*";
        
        return password.length() >=8 && password.matches(capital) && password.matches(small) && password.matches(digit) && password.matches(special);
        
    public String registerUser(String username, String password, String number){
         
         boolean validateNumber  = checkCellphoneNumber(number);
         boolean validateUsername = checkUsername(username);
         boolean validatePassword = checkPasswordComplexity(password);
         
         if(validateNumber == true && validateUsername == true && validatePassword == true){
             return"User is successfully registered";
         }else{
             return"User registration failed!";
         }
     }
     
     
     public String returnLoginStatus(String username, String password){
         boolean validateUsername = checkUsername(username);
         boolean validatePassword = checkPasswordComplexity(password);
         
         if (validateUsername == true && validatePassword == true){
             return"Successful login";
         }else{
             return"Login failed!";
         }
     }
}
