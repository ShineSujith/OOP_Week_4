package ie.atu;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("lets finish early");
        add();
        multiply();
        divide();
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

        int total = firstNumber / secondNumber;
        System.out.println("The total is: " + total);
    }
}
