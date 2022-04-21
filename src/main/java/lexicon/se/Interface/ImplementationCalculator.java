package lexicon.se.Interface;

public class ImplementationCalculator implements Calculator {
    @Override
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int division(int num1, int num2) {
        if (num1 < num2) {
            System.out.println("Invalid Division value");
                }
        return num1 / num2;

    }
}