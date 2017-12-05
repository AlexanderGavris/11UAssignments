/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment6;

import java.util.Scanner;

/**
 *
 * @author gavra1029
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //ask to enter MARKS 
        System.out.println("How many marks do you want to enter:");
        int amountmarks = input.nextInt();
        
        int[] mark = new int[amountmarks];

        System.out.println("Please enter " + amountmarks + " mark:");

        for (int i = 0; i < amountmarks; i++) {
            mark[i] = input.nextInt();

        }
        //sort the marks in oder


        for (int i = 0; i < amountmarks -1 ; i++) {
            for (int j = i + 1; j < amountmarks; j++) {
                if (mark[i] > mark[j]) {
                    int tempNum = mark[i];
                    mark[i] = mark[j];
                    mark[j] = tempNum;
                }

            }

        }
        //print out the lowest and highest 
        System.out.println("This is the lowest mark: " + mark[0]);
        System.out.println("This the highest: " + mark[amountmarks -1]);
        
        //add all the marks together
        double total = 0;
        // go through each student
        for (int i = 0; i < mark.length; i++) {
            // add expense to total
            total = total + mark[i];
            // calculate number of averge mark 
           total=total/amountmarks;
        }
        System.out.println("this is median: "+ total);
        
        
        
    }
}
