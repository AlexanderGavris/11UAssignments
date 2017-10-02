/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author gavra1029
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
        //make a robot
        Robot ob = new Robot(kw, 1, 1, Direction.EAST, 20);
        //make robot put things down in a 4 by 5 sqaure 
        while (ob.countThingsInBackpack() > 0) {
            for (int plantThing = 0; plantThing < 5; plantThing = plantThing + 1) {
                ob.putThing();
                ob.move();
            }
            if (ob.getAvenue() == 6) {

                ob.turnLeft();
                ob.turnLeft();
                ob.turnLeft();
                ob.move();
                ob.turnLeft();
                ob.turnLeft();
                ob.turnLeft();
                ob.move();
            } else { 
                 if (ob.getAvenue() == 0) {
                     ob.turnLeft();
                     ob.move();
                     ob.turnLeft();
                     ob.move();
                 }
                
            }
        }
    }
}
