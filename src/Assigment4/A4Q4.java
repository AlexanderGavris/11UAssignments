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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask the user for all the $ of 
        System.out.println("How much does the food for prom cost?");
        double food = input.nextDouble();
        System.out.println("How much does the DJ cost?");
        double dj=input.nextDouble();
        System.out.println("How much does it cost to rent the hall?");
         double hall=input.nextDouble();
        System.out.println("How much does decorations cost? ");
         double decorations=input.nextDouble();
        System.out.println("How much does it cost for Staff?");
         double staff=input.nextDouble();
        System.out.println("How much for miscellaneous costs?");
         double miscellaneous=input.nextDouble();
         System.out.println(food+hall+dj+decorations+staff );
         double total=food+hall+dj+decorations+staff;
         //divided by the total by the price of the ticket 
         double tickets=total/35;
         tickets = Math.ceil(tickets);
         //tell the user how many tickets they need 
         System.out.println(tickets+"This is how many tickets youu need");
         
    }
}
