/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment7;

import java.util.Scanner;

/**
 *
 * @author gavra1029
 */
public class A7Q2 {

    public void examGrade(double calPercent) {
        double percent = calPercent;
        if (percent < 50) {
            System.out.println(percent + "=F");
        } else if (50 < percent && percent < 59) {
            System.out.println(percent + "+D");
        } else if (60 < percent && percent < 69) {
            System.out.println(percent + "=c");
        } else if (70 < percent && percent < 79) {
            System.out.println(percent + "=B");
        } else if (80 < percent) {
            System.out.println(percent + "=A");

        }
    }

    public static void main(String[] args) {
        A7Q2 test = new A7Q2();
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is the % that you got the exam?");

        double percent = input.nextDouble();
        
        test.examGrade(percent);
        System.out.println("You grade in letter"+ percent );
        
        
        
        
    }
}
