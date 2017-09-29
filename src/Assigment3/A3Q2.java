/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author gavra1029
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
        //make a Robot
        Robot ob = new Robot(kw, 0, 0, Direction.EAST);
        //make things
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        new Thing(kw, 0, 0);
        //make it move the things one by one
        while (ob.canPickThing()) {
            for (int count = 0; count < 1; count = count + 1) {
                ob.pickThing();
                ob.move();
                ob.putThing();
                ob.turnLeft();
                ob.turnLeft();
                ob.move();
                ob.turnLeft();
                ob.turnLeft();

            }
        }
        ob.move();

    }
}
