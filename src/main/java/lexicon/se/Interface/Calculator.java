package lexicon.se.Interface;

import java.util.Scanner;

public interface Calculator {
    //static field declaration
    Scanner sc = new Scanner(System.in);

    //Abstract method (abstract methods always public, no need to write it)
    int addition(int num1, int num2);

    int subtraction(int num1, int num2);

    int multiplication(int num1, int num2);

    int division(int num1, int num2);

    //interfaces must be public or default

    default void welcomeMessage() {
        System.out.println("******Welcome to Calculation*****");
    }

    static String takeInput() {
        return sc.nextLine();
    }
}
