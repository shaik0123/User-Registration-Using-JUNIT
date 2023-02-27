package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    @DisplayName(" validate FirstName ")
    public void check_Given_FirstName_is_true_return_true(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getFirstName("Shaik");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName(" validate FirstName ")
    public void check_Given_FirstName_is_false_return_false(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getFirstName("shaik");
        Assertions.assertFalse(result);

    }



    @Test
    @DisplayName(" validate LastName")
    public void check_Given_LastName_is_true_return_true(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getLastName("Ismail");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName(" validate LastName")
    public void check_Given_LastName_is_false_return_false(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getLastName("ismail");
        Assertions.assertFalse(result);

    }

    @Test
    @DisplayName(" validate Email")
    public void check_Given_Email_Address_is_true_return_true(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getEmail("shaik.ismail8563@gmail.com");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName(" validate Email")
    public void check_Given_Email_Address_is_false_return_false(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getEmail("shaik.ismail8563@gmail.i");
        Assertions.assertFalse(result);

    }

    @Test
    @DisplayName(" validate PhoneNumber ")
    public void check_Given_Phone_Number_is_true_return_true(){

        UserRegistration phoneNumberTest = new UserRegistration();
        Boolean result =phoneNumberTest.getPhoneNumber("91 9515723435");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName(" validate PhoneNumber ")
    public void check_Given_Phone_Number_is_false_return_false(){

        UserRegistration phoneNumberTest = new UserRegistration();
        Boolean result =phoneNumberTest.getPhoneNumber("91 951572343590");
        Assertions.assertFalse(result);

    }

    @Test
    @DisplayName(" validate Password Rule 1")
    public void check_Given_Password_Rule1_is_true_return_true(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule1("ismail1234");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName(" validate Password Rule 1")
    public void check_Given_Password_Rule1_is_false_return_false(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule1("ismail");
        Assertions.assertFalse(result);

    }

    @Test
    @DisplayName(" validate Password Rule 2")
    public void check_Given_Password_Rule2_is_true_return_true(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule2("Ismail1234");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName(" validate Password Rule 2")
    public void check_Given_Password_Rule2_is_false_return_false(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule2("ismail1234");
        Assertions.assertFalse(result);

    }

    @Test
    @DisplayName(" validate Password  Rule 3")
    public void check_Given_Password_Rule3_is_true_return_true(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule3("Ismail1234");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName(" validate Password  Rule 3")
    public void check_Given_Password_Rule3_is_false_return_false(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule3("Ismailshaik");
        Assertions.assertFalse(result);

    }

    @Test
    @DisplayName(" validate Password  Rule 4")
    public void check_Given_Password_Rule4_is_true_return_true(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule4("Ismail@1234");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName(" validate Password  Rule 4")
    public void check_Given_Password_Rule4_is_false_return_false(){

        UserRegistration password_Test = new UserRegistration();
        Boolean result = password_Test.getPasswordRule4("ismail@1234");
        Assertions.assertFalse(result);

    }

}
