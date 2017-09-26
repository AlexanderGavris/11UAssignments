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
public class A2Bones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //make city
        City o = new City();
        o.showThingCounts(true);
        //make walls
        new Wall(o, 0, 3, Direction.WEST);
        new Wall(o, 0, 3, Direction.SOUTH);
        new Wall(o, 0, 4, Direction.SOUTH);
        new Wall(o, 0, 5, Direction.SOUTH);
        new Wall(o, 0, 6, Direction.SOUTH);
        new Wall(o, 1, 6, Direction.EAST);
        new Wall(o, 2, 6, Direction.EAST);
        new Wall(o, 2, 6, Direction.SOUTH);
        new Wall(o, 2, 5, Direction.SOUTH);
        new Wall(o, 2, 4, Direction.SOUTH);
        new Wall(o, 2, 3, Direction.SOUTH);
        new Wall(o, 3, 3, Direction.WEST);
        new Wall(o, 3, 3, Direction.SOUTH);
        new Wall(o, 3, 4, Direction.SOUTH);
        new Wall(o, 3, 5, Direction.SOUTH);
        new Wall(o, 3, 6, Direction.SOUTH);
        new Wall(o, 4, 6, Direction.EAST);
        new Wall(o, 4, 3, Direction.SOUTH);
        new Wall(o, 4, 4, Direction.SOUTH);
        new Wall(o, 4, 5, Direction.SOUTH);
        new Wall(o, 4, 6, Direction.SOUTH);
        new Wall(o, 5, 3, Direction.WEST);
        new Wall(o, 6, 3, Direction.WEST);
        new Wall(o, 6, 3, Direction.SOUTH);
        new Wall(o, 6, 4, Direction.SOUTH);
        new Wall(o, 6, 5, Direction.SOUTH);
        new Wall(o, 6, 6, Direction.SOUTH);
        new Wall(o, 6, 7, Direction.SOUTH);
        new Wall(o, 7, 7, Direction.EAST);
        new Wall(o, 8, 7, Direction.EAST);
        new Wall(o, 8, 6, Direction.SOUTH);
        new Wall(o, 8, 5, Direction.SOUTH);
        new Wall(o, 8, 4, Direction.SOUTH);
        new Wall(o, 8, 7, Direction.SOUTH);
        new Wall(o, 8, 3, Direction.SOUTH);
        new Wall(o, 8, 3, Direction.SOUTH);
        new Wall(o, 9, 2, Direction.SOUTH);
        new Wall(o, 9, 2, Direction.EAST);
        new Wall(o, 9, 2, Direction.WEST);
        new Wall(o, 0, 1, Direction.EAST);
        new Wall(o, 1, 1, Direction.EAST);
        new Wall(o, 2, 1, Direction.EAST);
        new Wall(o, 3, 1, Direction.EAST);
        new Wall(o, 4, 1, Direction.EAST);
        new Wall(o, 5, 1, Direction.EAST);
        new Wall(o, 6, 1, Direction.EAST);
        new Wall(o, 7, 1, Direction.EAST);
        new Wall(o, 8, 1, Direction.EAST);
        new Wall(o, 9, 1, Direction.EAST);
      
                
        



        //put "snow" in (Things)
        new Thing(o, 1, 2);
        new Thing(o, 1, 3);
        new Thing(o, 1, 4);
        new Thing(o, 1, 5);
        new Thing(o, 2, 2);
        new Thing(o, 2, 4);
        new Thing(o, 2, 6);
        new Thing(o, 4, 2);
        new Thing(o, 4, 3);
        new Thing(o, 4, 4);
        new Thing(o, 7, 2);
        new Thing(o, 7, 3);
        new Thing(o, 8, 3);
        new Thing(o, 8, 4);
        new Thing(o, 8, 6);
        new Thing(o, 7, 7);
        //make new robot
        Robot ob = new Robot(o, 0, 2, Direction.SOUTH);
        // tell the robot to pick thing up
        while (true) {
            ob.move();
            while (ob.canPickThing()) {
                ob.pickThing();
                ob.turnLeft();
            }
            while (true) {
                if (ob.canPickThing()) {
                    ob.pickThing();
                    ob.move();
                } else if (ob.frontIsClear()) {
                    ob.move();
                } else {
                    while (ob.getDirection() != Direction.WEST) {
                        ob.turnLeft();
                    }
                    while (ob.getAvenue() != 2) {
                        ob.move();
                    }
                    


                }
            }


        }


    }
}
