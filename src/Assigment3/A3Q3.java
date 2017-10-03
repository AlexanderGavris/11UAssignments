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
public class A3Q3 {

    public static void main(String[] args) {
        //make a city 
        City kw = new City();
        //make a robot
        Robot ob=new Robot(kw,3,3,Direction.SOUTH);
        //make the 4 2 by 2 walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,2,Direction.EAST);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,1,5,Direction.NORTH);
        new Wall(kw,1,5,Direction.EAST);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,4,Direction.WEST);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,2,5,Direction.EAST);
        new Wall(kw,4,1,Direction.NORTH);
        new Wall(kw,4,1,Direction.WEST);
        new Wall(kw,4,2,Direction.NORTH);
        new Wall(kw,4,2,Direction.EAST);
        new Wall(kw,5,1,Direction.SOUTH);
        new Wall(kw,5,1,Direction.WEST);
        new Wall(kw,5,2,Direction.SOUTH);
        new Wall(kw,5,2,Direction.EAST);
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,4,Direction.WEST);
        new Wall(kw,4,5,Direction.NORTH);
        new Wall(kw,4,5,Direction.EAST);
        new Wall(kw,5,4,Direction.SOUTH);
        new Wall(kw,5,4,Direction.WEST);
        new Wall(kw,5,5,Direction.SOUTH);
        new Wall(kw,5,5,Direction.EAST);
        
        
        
        
       
    }
}
