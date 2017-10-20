/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment4;

import java.util.Scanner;

/**
 *
 * @author gavra1029
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //rardar checks what the speed on your car is
        System.out.println("Enter the speed limit? ");
        int speed = input.nextInt();

        System.out.println("Enter the recorded speed of the car");
        int speedLimit = input.nextInt();

        //the radar caluate if a car is within the speed limit 
        int ticket = speedLimit - speed;
        if (ticket <= 0) {

            System.out.println("You are within the speed limit");
        }
        if (ticket >= 1 && ticket <= 20) {

            System.out.println("You are speeding, and your fine is $100");
        }
        if (ticket >= 21 && ticket <= 30) {

            System.out.println("You are speeding, and your fine is $270");
        }
        if (ticket >= 31) {

            System.out.println("You are speeding, and your fine is $500");
        }
    }
}
