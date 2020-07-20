/*Programmer: Austin Parker
* Date: May 20, 2020
* Purpose: Determines required minimum length required to land on runway */

import java.text.DecimalFormat;
import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {

        /*Listens for user input*/
        Scanner input = new Scanner(System.in);

        /*Asks user for information then stores the input in var speed*/
        System.out.println("Enter speed: ");
        double speed = input.nextDouble();

        /*Asks user for information then stores the input in var acceleration*/
        System.out.println("Enter acceleration: ");
        double acceleration = input.nextDouble();

        /*calculates user input */
        double length = Math.pow(speed, 2) / (2 * acceleration);

        /*This will limit the result to only 3 places to right of decimal*/
        DecimalFormat lengthFormat = new DecimalFormat("#.000");

        /*displays results*/
        System.out.println("The minimum runway length for this airplane is: " + lengthFormat.format(length));

    }

}
