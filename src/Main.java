import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        System.out.println("What is your name? ");
        Scanner ner = new Scanner(System.in);
        String firstName = ner.nextLine();
        System.out.println("What is your Favourite food? ");
        Scanner hey = new Scanner(System.in);
        String favouriteFood = hey.nextLine();
        System.out.println("First Name: " + firstName + "\nAge: " + age + "\nFavourite Food:" + favouriteFood);





    }

}
