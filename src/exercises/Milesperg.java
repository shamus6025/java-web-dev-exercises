package exercises;

import java.util.Scanner;

public class Milesperg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesNum = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        Double galsNum = input.nextDouble();

        Double mpg = milesNum / galsNum;
        System.out.println("Your car is getting " + mpg + " Miles Per Gallon");
    }
}
