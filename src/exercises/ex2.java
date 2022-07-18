package exercises;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your rectangle length?");
        Double recLength = input.nextDouble();

        System.out.println("What is your rectangle width?");
        Double recWidth = input.nextDouble();

        Double area = recLength * recWidth;
        System.out.println("Your rectangle has an area of " + area + ".");
    }
}
