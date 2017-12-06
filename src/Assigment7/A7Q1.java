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
public class A7Q1 {

    public double areaOfCircle(double radius) {
        //make the formula to calultee area
        double answer = Math.PI * Math.pow(radius, 2);
        //back answer
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * @param args the command line arguments
         */
        //create an object to run the methods
        A7Q1 test = new A7Q1();
        //create a scanner


        System.out.println("What is the radius of the circle? ");

        //make a var to store radius
        double radius = input.nextDouble();

        //calculat the area 
        double area = test.areaOfCircle(radius);

        //round the answer to 2nd decemal
        area = Math.round(area * 100) / 100.0;

        //output area of circle
        System.out.println("The area of the circle is " + area);
    }
}
