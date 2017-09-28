/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author gavra1029
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
        //make a Robot
        Robot ob = new Robot(kw,0,2,Direction.EAST);
        //make Wall
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,2,Direction.EAST);
        
        
    }
}
