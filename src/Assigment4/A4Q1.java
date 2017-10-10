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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        // get name from the user
        // tell the user what they need to do
        System.out.println("Please enter your name:");
        // use the scanner to input the name
        String firstName = input.nextLine();

        // output the variable to the screen
        System.out.println("Hello " + firstName);

        // ask the person How are you
        System.out.println("How are you?");
        
       
    }
}