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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        
        //ask to enter MARKS 
        System.out.println("How many marks do you want to enter:");
        int amountmarks = input.nextInt();
        
        int[] mark = new int[amountmarks];

        System.out.println("Please enter " + amountmarks + " mark:");

        for (int i = 0; i < amountmarks; i++) {
            mark[i] = input.nextInt();

        }
        //sort the 10 marks in oder


        for (int i = 0; i < amountmarks -1 ; i++) {
            for (int j = i + 1; j < amountmarks; j++) {
                if (mark[i] > mark[j]) {
                    int tempNum = mark[i];
                    mark[i] = mark[j];
                    mark[j] = tempNum;
                }

            }

        }
        //tell the coump to run it amountmarks times
        for (int i = 0; i < amountmarks; i++) {
            System.out.println("the "+amountmarks+ " mark in order is:"+ mark[i]);
   
            
            
          
  
            
        }
        // find the mediean of the array
            if(amountmarks % 2 == 0){
                //this mean the num is even 
                System.out.println(mark[amountmarks/2]);
         
            }else{
                //this means the num is odd
                System.out.println(mark[amountmarks/2]);
                
            }
    }
}
