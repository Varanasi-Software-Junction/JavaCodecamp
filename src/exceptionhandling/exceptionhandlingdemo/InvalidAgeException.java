package exceptionhandling.exceptionhandlingdemo;

import java.util.Scanner;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {
        super("The given age is invalid");
    }
}
