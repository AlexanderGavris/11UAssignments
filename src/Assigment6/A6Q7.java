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
        int[] num = new int[1001];

        //filled the array starting at 2
        System.out.println("The prime numbers are");
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        for (int x = 2; x < num.length; x++) {
            if (num[x] != 0) {

                int p = num[x];


                //make a for loop to count multi #s
                for (int i = 2; i * p < num.length; i++) {
                    num[i * p] = 0;
                }
                //print out what all the prim numbers

                System.out.println(num[x]);
            }
            
        }



    }
}
