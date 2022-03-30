package com.binay.demo.prog.exception;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no: ");
        String mobileNo = scanner.next();

        if(Objects.isNull(mobileNo) || mobileNo.length() != 10) {
            throw new InvalidMobileNo("Invalid mobile no. Should have 10 digits");
        }
        System.out.println("Your age is valid.");
    }
}

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String errorMessage) {
        super(errorMessage);
    }
}

class InvalidMobileNo extends RuntimeException {
    public InvalidMobileNo(String errorMessage) {
        super(errorMessage);
    }
}