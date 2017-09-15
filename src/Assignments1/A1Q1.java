/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author gavra1029
 */
public class A1Q1 {
    private static City alxendoor;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //add a city//
       City alexendoor= new City ();
       
       //add a robot 
       Robot ob = new Robot (alexendoor,  0, 2, Direction. WEST  );
       //create 2 by 2 wall 
       new Wall(alexendoor, 1,1, Direction. NORTH );
       new Wall(alexendoor,1,2, Direction. NORTH );
       new Wall (alexendoor, 1,1, Direction.WEST);
       new Wall(alexendoor,2,1, Direction.WEST);
       new Wall(alexendoor,2,1,Direction.SOUTH);
       new Wall(alexendoor,2,2,Direction.SOUTH);
       new Wall (alexendoor,2,2, Direction.EAST);
       new Wall (alexendoor,1,2,Direction.EAST); 
       ob.move();
       ob.move();
       ob.turnLeft();
       ob.move();
       ob.move();
       ob.move();
       ob.turnLeft();
       ob.move();
       ob.move();
       ob.move();
       ob.turnLeft();
       ob.move();
       ob.move();
       ob.move();
       ob.turnLeft();
       ob.move();
       
       
       
               
             }
}
