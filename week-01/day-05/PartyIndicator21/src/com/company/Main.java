import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        Scanner sc1 = new Scanner (System.in);
        int girl = sc1.nextInt();
        Scanner sc2 = new Scanner (System.in);
        int boy = sc2.nextInt();

        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        if ((girl == boy) && (girl + boy >= 20)){
            // It should print: The party is excellent!
            System.out.println("The party is excellent!");}

        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        else if ((girl + boy >=20) && (girl != boy )){
            // It should print: Quite cool party!
            System.out.println("Quite cool party!");}

        // If there are less people coming than 20
        else if ((girl + boy < 20) && (girl > 0)){
            // It should print: Average party...
            System.out.println("Avarage party...");}


// If no girls are coming, regardless the count of the people
        else if (girl == 0){
            // It should print: Sausage party
            System.out.println("Sausage party");}

    }
}
