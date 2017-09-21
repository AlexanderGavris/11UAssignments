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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City alexendoor= new City ();
        
        //make wall
        
        new Wall(alexendoor,3,1, Direction.EAST);
        new Wall(alexendoor,3,2, Direction.NORTH);
        new Wall(alexendoor,2,3,Direction.WEST );
        new Wall(alexendoor,1,3, Direction.EAST);
        new Wall (alexendoor,1,3,Direction.NORTH);
        new Wall (alexendoor,1,3,Direction.WEST); 
        new Wall(alexendoor,2,4,Direction.NORTH);
        new Wall(alexendoor,2,4,Direction.EAST);
        new Wall (alexendoor,3,4,Direction.EAST);
        new Thing(alexendoor,3,1); 
        //make robot
        Robot ob=new Robot(alexendoor,3,0,Direction.EAST); 
        //tell robot to move
        ob.move();
        ob.pickThing();
        ob.turnLeft();
        ob.move();
        ob.turnLeft();
        ob.turnLeft();
        ob.turnLeft();
        ob.move();
        ob.turnLeft();
        ob.move();
        ob.move();
        ob.turnLeft();
        ob.turnLeft();
        ob.turnLeft();
        ob.move();
        ob.putThing();
        ob.move();
        ob.turnLeft();
        ob.turnLeft();
        ob.turnLeft();
        ob.move();
        ob.turnLeft();
        ob.move();
        ob.turnLeft();
        ob.turnLeft();
        ob.turnLeft();
        ob.move();
        ob.move();
        ob.turnLeft();
   
        
        
        
    }
}
