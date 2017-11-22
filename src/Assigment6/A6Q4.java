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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mark = new int[10];
        //ask to enter 10 marks

        System.out.println("Please enter ten mark:");

        for (int i = 0; i < 10; i++) {
            mark[i] = input.nextInt();

        }
        //sort the 10 marks in oder


        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (mark[i] > mark[j]) {
                    int tempNum = mark[i];
                    mark[i] = mark[j];
                    mark[j] = tempNum;
                }

            }

        }
        //tell the coump to run it 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("the 10 mark in order is:"+ mark[i]    );
        }









    }
}
