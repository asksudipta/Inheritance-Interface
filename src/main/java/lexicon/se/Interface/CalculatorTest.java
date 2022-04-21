package lexicon.se.Interface;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator calculator = new ImplementationCalculator();
        calculator.welcomeMessage();

        //Initiating the overriding method in while loop
        String operation;
        while (true) {
            System.out.println("Lets Start Calculation");
            System.out.println(" *****Enter First Number *****");
            String num1 = Calculator.takeInput();

            System.out.println(" *****Enter Second Number *****");
            String num2 = Calculator.takeInput();

            System.out.println("Enter a valid operation (+,-,*,/   c= exit)");
            String operator = Calculator.takeInput();

            switch (operator) {
                case "+":
                    int additionResult = calculator.addition(Integer.parseInt(num1), Integer.parseInt(num2));
                    System.out.println("additionResult = " + additionResult);
                    break;
                case "-":
                    int subtractionResult = calculator.subtraction(Integer.parseInt(num1), Integer.parseInt(num2));
                    System.out.println("subtractionResult = " + subtractionResult);
                    break;
                case "*":
                    int multiplicationResult = calculator.multiplication(Integer.parseInt(num1), Integer.parseInt(num2));
                    System.out.println("multiplicationResult = " + multiplicationResult);
                    break;
                case "/":
                    int DivisionResult = calculator.division(Integer.parseInt(num1), Integer.parseInt(num2));
                    System.out.println("DivisionResult = " + DivisionResult);
                    break;
                case "c":
                    System.exit(0);
                default:
                    System.out.println("****Operation not Valid ***");
            }
            System.out.println("*********DONE*********");
        }
    }
}
