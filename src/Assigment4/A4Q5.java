/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment4;

import java.util.Scanner;

/**
 *
 * @author gavra1029
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         //
        System.out.println("What was the first test out of ?");
        double totalTest1 = input.nextDouble();
        
        
        System.out.println("What did you get on your test ?");
        double firstTest = input.nextDouble();
        
        System.out.println("What was the seccond test out of ?");
        double totalTest2 = input.nextDouble();
                
        System.out.println("What did you get on your seccond test?");
        double seccondTest=input.nextDouble();
        
        System.out.println("What was the third test out of ?");
        double totalTest3 = input.nextDouble();
                
        System.out.println("What did you get on your third test?");
         double thirdTest=input.nextDouble();
         
         System.out.println("What was the fourth test out of ?");
        double totalTest4 = input.nextDouble();
         
        System.out.println("What did you get on your forth test? ");
         double forthTest=input.nextDouble();
         
         System.out.println("What was the fivth test out of ?");
        double totalTest5 = input.nextDouble();
         
        System.out.println("What did you get on your fivth test?");
         double fivthTest=input.nextDouble();
         
         
        //caluate your test %
        double average1=firstTest/totalTest1*100;
        double average2=seccondTest/totalTest1*100;
        double average3=thirdTest/totalTest1*100;
        double average4=forthTest/totalTest1*100;
        double average5=fivthTest/totalTest1*100;
         
       
        
        //output all the scores 
         System.out.println("Test1:"+average1);
         System.out.println("Test2:"+average2);
         System.out.println("Test3:"+average3);
         System.out.println("Test4:"+average4);
         System.out.println("Test5:"+average5);
         //the totalaverage 
        double totalAverage=firstTest+seccondTest+thirdTest+forthTest+fivthTest/5;
        double totalTest= totalAverage*100;
        //tell the user the total average
         System.out.println();
                
    }
}
