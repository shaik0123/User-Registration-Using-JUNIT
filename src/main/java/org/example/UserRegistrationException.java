package org.example;

public class UserRegistrationException {
    boolean result;

    public boolean getFirstName(String firstName){

        result = firstName.matches("^[A-Z]{1}[a-z]{3,}");

        try{
            if(!result){
                throw new UserValidationCustomException("Entered Firstname is Invalid");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;

    }


    public Boolean getLastName(String lastName) {

        result = lastName.matches("^[A-Z]{1}[a-z]{3,}");

        try{
            if(!result){
                throw new UserValidationCustomException("Entered Lastname is Invalid");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;

    }

    public Boolean getEmail(String email) {

        result = email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$");

        try{
            if(!result){
                throw new UserValidationCustomException("Entered Email is Invalid");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;

    }

    public Boolean getPhoneNumber(String phoneNumber) {

        result = phoneNumber.matches("^[1-9]{2}\\s[0-9]{10}$");

        try{
            if(!result){
                throw new UserValidationCustomException("Entered PhoneNumber is Invalid || Please Check");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }
        return result;

    }

    public Boolean getPassword(String passWord) {

        result = passWord.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=.*[a-z]).{8,}$");

        try{
            if(!result){
                throw new UserValidationCustomException("Entered PassWord is Invalid || Please Check");
            }
        } catch (UserValidationCustomException e) {
            System.out.println(e.getMessage());
        }

        return result;

    }





}
