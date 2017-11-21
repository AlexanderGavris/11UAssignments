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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        // find the amount of people
        System.out.println("Please enter two numbers:");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        //make a arrey to store numOne numTwo
        
        int[] dNum = new int[2];
        dNum[0]=numOne;
        dNum[1]=numTwo;
        
        //make to make 
        if (dNum[0] > dNum[1]) {
            int tempNum = dNum[0] ;
            dNum[0]=dNum[1];
            dNum[1]=tempNum; 
            
            
        }
        System.out.println("Your #s in order are:"+ dNum[0] + ","+ dNum[1] );


















    }
}
