import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        // If it is bigger it should count from the first number to the second by one
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 >= num2) {
            System.out.println("The second number should be bigger");}
            else {
            for (int i = 0; i < num2; i++)
                    System.out.println(i);
                    }
        }


    }

