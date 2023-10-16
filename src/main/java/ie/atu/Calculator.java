package ie.atu;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to multiply");
        System.out.println("Enter 3 to divide");
        System.out.println("Enter 4 to subtract");
        Scanner inputs = new Scanner(System.in);
        int userInput = inputs.nextInt();
        switch(userInput)
        {
            case 1:
                add();
                break;
            case 2:
                multiply();
                break;
            case 3:
                divide();
                break;
            case 4:
                subtract();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static void add()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is: " + total);
    }
    public static void multiply()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is: " + total);
    }
    public static void divide()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        float total = (float)firstNumber / secondNumber;
        System.out.println("The total is: " + total);
    }
    public static void subtract()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is: " + total);
    }
}
