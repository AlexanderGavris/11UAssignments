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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for input
        Scanner input = new Scanner(System.in);
        //ask how many people are in the class
        System.out.println("Please enter the number of students:");
        int studentsInClass = input.nextInt();
        //make an aarry to list the marks of all the students 
        double[] students = new double[studentsInClass];

        //loop to get all info
        for (int i = 0; i < students.length; i++) {
            // ask what are all the marks 
            System.out.println("Please enter the marks for each student:");
            int markInClass = input.nextInt();
            students[i] = markInClass;
        }
        //add all the marks together
        double total = 0;
        // go through each student
        for (int i = 0; i < students.length; i++) {
            // add expense to total
            total = total + students[i];
            // calculate number of tickets to sell


        }
        //divide the total by number of students 
        double average = Math.round(total*100 / students.length)/100.0;
        //tell what the class average is
        System.out.println("The avrage of the class:"+average );


    }
}

