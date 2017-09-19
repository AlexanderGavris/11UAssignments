/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author gavra1029
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         City alexendoor= new City ();
         
         //add a robot 
       Robot ob = new Robot (alexendoor,  1, 2,Direction. SOUTH  );
       
       //add new walls
       new Wall(alexendoor,1,2, Direction.NORTH);
       new Wall(alexendoor,1,2,Direction.EAST);
       new Wall(alexendoor,1,2,Direction.SOUTH);
       new Wall(alexendoor,1,1,Direction.NORTH);
       new Wall(alexendoor,1,1,Direction.WEST);
       new Wall(alexendoor,2,1,Direction.WEST);
       new Wall(alexendoor,2,1,Direction.SOUTH);
       
       
       //add object
       new Thing(alexendoor,2,2);
       
       ob.turnLeft();
       ob.turnLeft();
       ob.turnLeft();
       ob.move();
       ob.turnLeft();
       ob.move();
       ob.turnLeft();
       ob.move();
       ob.pickThing();
       ob.turnLeft();
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
       ob.turnLeft();
       ob.turnLeft();
         
    }
}
