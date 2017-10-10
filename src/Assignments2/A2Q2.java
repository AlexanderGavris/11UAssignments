/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author gavra1029
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //make city
        City q = new City();
        // make wall 
        new Wall(q, 3, 1, Direction.SOUTH);
        new Wall(q, 3, 1, Direction.EAST);
        new Wall(q, 3, 2, Direction.SOUTH);
        new Wall(q, 3, 2, Direction.EAST);
        new Wall(q, 3, 3, Direction.SOUTH);
        new Wall(q, 3, 4, Direction.SOUTH);
        new Wall(q, 3, 5, Direction.SOUTH);
        new Wall(q, 3, 5, Direction.EAST);
        new Wall(q, 3, 6, Direction.SOUTH);
        new Wall(q, 3, 7, Direction.SOUTH);
        new Wall(q, 3, 8, Direction.SOUTH);
        
        //make thing
        new Thing(q, 3, 8);
        //make a robot
        Robot ob = new Robot(q, 3, 1, Direction.EAST);
        //make him move only over the herdel 
        while (!ob.canPickThing()) {
            if (ob.frontIsClear()) {
                ob.move();
            } else {
                ob.turnLeft();
                ob.move();
                ob.turnLeft();
                ob.turnLeft();
                ob.turnLeft();
                ob.move();
                ob.turnLeft();
                ob.turnLeft();
                ob.turnLeft();
                ob.move();
                ob.turnLeft();
                
            }


        }


    }
}
