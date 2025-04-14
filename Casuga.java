import java.util.Scanner;

public class Casuga {
    public static void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! This is Casuga contributing to the project.");
        System.out.print("Please enter your age: 20 ");
        int age = input.nextInt();
        System.out.println("Your current age is: 20 " + age);
        System.out.println("Next year, you will be: 21 " + (age + 1));
    }
}
