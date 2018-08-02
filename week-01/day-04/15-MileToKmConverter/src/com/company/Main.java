import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner sc = new Scanner (System.in);
        double km = sc.nextDouble();
        System.out.println(km * 1.6214);


    }
}
