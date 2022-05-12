package dev.group1.Potlukk.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException() {
        super("User not found.");
    }
}
