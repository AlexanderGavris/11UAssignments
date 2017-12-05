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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //make an array that goes up to 1000
        int[] numbers = new int[1001];

        //filled the array starting at 2
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int x = 2; x < numbers.length; x++) {
            if (numbers[x] != 0) {

                int p = numbers[x];
                

                //make a for loop to count multi #s
                for (int i = 2; i * p < numbers.length; i++) {
                    numbers[i * p] = 0;
                }
                //print out what all the prim numbers
                
                System.out.println("The prime numbers are " + numbers[x]);
            }
        }



    }
}
