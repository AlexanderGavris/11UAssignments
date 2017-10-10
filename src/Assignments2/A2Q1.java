/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author gavra1029
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //make a city
        City kw= new City();
        //make a robot named Alex
        Robot Alex= new Robot(kw,1,1,Direction.EAST);
        //put down things 10 in a row
        new Thing(kw,1,2);
        new Thing(kw,1,3);
        new Thing(kw,1,4);
        new Thing(kw,1,5);
        new Thing(kw,1,6);
        new Thing(kw,1,7);
        new Thing(kw,1,8);
        new Thing(kw,1,9);
        new Thing(kw,1,10);
        new Thing(kw,1,11);
        //make the robot pick 7 thing up and make him move passed the four
        while(Alex.countThingsInBackpack() <7){
            Alex.move();
            Alex.pickThing();
            
        }
        //move 4 times
        Alex.move();
        Alex.move();
        Alex.move();
        Alex.move();
        
    }
}
