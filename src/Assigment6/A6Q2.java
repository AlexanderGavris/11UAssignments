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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // find the amount of people
        System.out.println("Please enter the amount of the people:");
        int numPeople = input.nextInt();
        //make a arrey to store the hight of the people
        double[] peopleHight = new double[numPeople];
        //loop to get all info
        for (int i = 0; i < peopleHight.length; i++) {
            // ask what are all the heights 
            System.out.println("Please enter the height for each person:");
            int hight = input.nextInt();
            peopleHight[i] = hight;
        }
        //add all the hights together
        double total = 0;
        // go through each student
        for (int i = 0; i < peopleHight.length; i++) {
            // add hight to total
            total = total + peopleHight[i];
            // calculate number of averge hight 



        }
        //calutale the average
        double average = Math.round(total * 100 / peopleHight.length) / 100.0;
         System.out.println("This is the average:" + average);
         // see which persons height is bigger then the average
        for (int i = 0; i < peopleHight.length; i++) {
            if (peopleHight[i] > average) {
                System.out.println("these are the people that are greater then the height average:" + peopleHight[i]);
            }
        }
















    }
}
