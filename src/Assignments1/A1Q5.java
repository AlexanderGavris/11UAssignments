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
public class A1Q5 {
    
    public static void main(String[] args){
    //make city
    City obo = new City();
    //make robots 
    Robot ob = new Robot(obo,3,3,Direction.EAST );
    Robot o = new Robot (obo,0,1,Direction.WEST);
    //wall
    new Wall(obo,2,3,Direction.NORTH); 
    new Wall(obo,2,3,Direction.EAST); 
    new Wall(obo,2,3,Direction.WEST); 
    new Wall(obo,3,3,Direction.EAST); 
    new Wall(obo,3,3,Direction.SOUTH); 
    ob.setLabel("K");
    new Thing(obo,0,0);
    new Thing(obo,1,0);
    new Thing(obo,1,1);
    new Thing(obo,2,1);
    new Thing(obo,2,2);
    //lable o
    o.setLabel("M");
    //move robot o
    o.move();
    o.pickThing();
    o.turnLeft();
    o.move();
    o.pickThing();
    o.turnLeft();
    o.move();
    o.pickThing();
    o.turnLeft();
    o.turnLeft();
    o.turnLeft();
    o.move();
    o.pickThing();
    o.turnLeft();
    o.move();
    o.pickThing();
    o.turnLeft();
    o.move();
    o.turnLeft();
    o.move();
    o.turnLeft();
    o.turnLeft();
    //move robot ob
    ob.turnLeft();
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
