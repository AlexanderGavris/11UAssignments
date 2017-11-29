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
        //ask to enter #'s 
        System.out.println("How many numbers do you want to enter:");

        int[] num = new int[999];
        //fill array
        for (int i = 0; i < num.length; i++) {
            num[i]=i+2;
        }
        
        for (int i = 0; i < num.length; i++) {
            if(num[i]!=0){
                for (int j = 2; j < num.length; j++) {
                    
                }
            }
        }
    }
    
}
