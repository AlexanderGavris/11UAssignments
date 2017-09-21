/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author gavra1029
 */
public class A2Q4 {

    public static void main(String[] args) {
        // TODO code application logic here
        //make a city
        City q = new City();
        //make walls
        new Wall(q, 1, 1, Direction.EAST);
        new Wall(q, 1, 1, Direction.NORTH);
        new Wall(q, 1, 1, Direction.SOUTH);
        new Wall(q, 1, 1, Direction.WEST);
        new Wall(q, 2, 2, Direction.NORTH);
        new Wall(q, 2, 2, Direction.WEST);
        new Wall(q, 1, 4, Direction.EAST);
        new Wall(q, 1, 4, Direction.NORTH);
        new Wall(q, 1, 4, Direction.WEST);
        new Wall(q, 1, 4, Direction.SOUTH);
        new Wall(q, 2, 3, Direction.NORTH);
        new Wall(q, 2, 3, Direction.EAST);
        new Wall(q, 3, 2, Direction.WEST);
        new Wall(q, 3, 2, Direction.SOUTH);
        new Wall(q, 3, 3, Direction.EAST);
        new Wall(q, 3, 3, Direction.SOUTH);
        new Wall(q, 4, 1, Direction.EAST);
        new Wall(q, 4, 1, Direction.NORTH);
        new Wall(q, 4, 1, Direction.WEST);
        new Wall(q, 4, 1, Direction.SOUTH);
        new Wall(q, 4, 4, Direction.EAST);
        new Wall(q, 4, 4, Direction.WEST);
        new Wall(q, 4, 4, Direction.NORTH);
        new Wall(q, 4, 4, Direction.SOUTH);
        //make Robot
        Robot ob = new Robot(q, 0, 1, Direction.EAST);
        //make a loop for the robot to go around the building\
        while (true) {
            if (ob.frontIsClear()) {
                ob.move();
                ob.turnLeft();
                ob.turnLeft();
                ob.turnLeft();
                ob.move();
            } else {
                if (!ob.frontIsClear()) {
                    ob.turnLeft();
                    ob.move();
                    ob.turnLeft();
                }
            }
        }
    }
}