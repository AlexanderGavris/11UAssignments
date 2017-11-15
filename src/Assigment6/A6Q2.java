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
        // for all the hight
        System.out.println("Please enter the hight of the people:");
        int numPeople = input.nextInt();
        //make a arrey to store the hight of the people
        double[] peopleHight = new double[numPeople];
        //loop to get all info
        for (int i = 0; i < peopleHight.length; i++) {
            // ask what are all the heights 
            System.out.println("Please enter the height for each person:");
            int markInClass = input.nextInt();
            peopleHight[i] = markInClass;
        
        














    }
}
