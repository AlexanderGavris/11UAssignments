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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for the four numbers
        System.out.println("Please write four numbers:");
        //i made sure that the user types in 4 times
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        //made it print out all in one line
        System.out.println(number1 + "," + number2 + "," + number3 + "," + number4);

    }
}
