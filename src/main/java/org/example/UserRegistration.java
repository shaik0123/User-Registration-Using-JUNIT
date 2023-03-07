package org.example;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    boolean result;

    Predicate<String> userFirstName = firstName -> {

        result = firstName.matches("^[A-Z]{1}[a-z]{3,}");
        try{
            if(!result){
                throw new UserValidationCustomException("Entered Firstname is Invalid");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;
    };

    Predicate<String> userLastName = lastName -> {

        result = lastName.matches("^[A-Z]{1}[a-z]{3,}");
        try{
            if(!result){
                throw new UserValidationCustomException("Entered LastName is Invalid");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;
    };

    Predicate<String> userEmailId = emailId -> {

        result = emailId.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$");
        try{
            if(!result){
                throw new UserValidationCustomException("Entered Email Id is Invalid");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;
    };

    Predicate<String> userPhoneNumber = phoneNumber -> {

        result = phoneNumber.matches("^[1-9]{2}\\s[0-9]{10}");
        try{
            if(!result){
                throw new UserValidationCustomException("Entered Phone Number is Invalid");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;
    };

    Predicate<String> userPassWord = passWord -> {

        result = passWord.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=.*[a-z]).{8,}$");
        try{
            if(!result){
                throw new UserValidationCustomException("Entered Password is Invalid");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;
    };

}
