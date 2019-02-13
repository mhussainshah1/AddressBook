###Create an address book class with validation in the setters

An address book contains the following fields: name, address, city, state, zip, phone, email.

Create an object to hold those fields. Each field should be private and accessible to the main application only through the getters and setters. One advantage of using getters and setters is to allow you to not only set the value of a field, such as email and phone, but also validate the data as it comes in.

Create a setter for phone and email that verify that the phone number is in the following format: (xxx) xxx-xxxx. Create a setter for the email address to ensure it contains name@domain.com.

To validate the email address and phone we're going to use something called regular expressions. We don't need to know about this right now - it's not something we teach until the last few weeks of class. So here is the code to validate these two fields. Simply copy the following methods to your address book class. They are private methods so you will call them from your setter to determine if the email/phone is valid.

You will also need ot import the following:
```
import java.util.regex.Matcher;
import java.util.regex.Pattern;
```
```
private boolean isEmailValid(String email){  
        boolean isValid = false;  

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
        CharSequence inputStr = email;  
        //Make the comparison case-insensitive.  
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    } 
    
    private boolean isPhoneNumberValid(String phoneNumber){  
        boolean isValid = false;  

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
        CharSequence inputStr = phoneNumber;  
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    }  
 ```