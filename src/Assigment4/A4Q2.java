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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //tell the program to ask for your hight 
         System.out.println("Please enter your height in inches :");
         double height = input.nextDouble();
         // height in cm
         height= height * 2.56 ;
         System.out.println("You are " + height + " cm");

         
         
    }
}
