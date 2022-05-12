package dev.group1.Potlukk.exceptions;

public class IncorrectLoginCredentialsException extends Exception{
    public IncorrectLoginCredentialsException(){
        super("Username or password is incorrect");
    }
}
