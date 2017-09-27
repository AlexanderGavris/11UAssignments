/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author gavra1029
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //make city
        City q= new City(); 
        //make robot
        Robot ob=new Robot(q,31,40,Direction.EAST ); 
        //find direction of robot and move
        while(ob.getDirection()!=Direction.NORTH ){
            ob.turnLeft();   
        }
        while(ob.getStreet()!=0 ){
           ob.move(); 
        }
        //make robot turn
        ob.turnLeft();
        while(ob.getDirection()!=Direction.WEST ){
            ob.turnLeft();
        }
        //tell robot to move to avenue 2
        while(ob.getAvenue()!=0 ){
            ob.move();
        }
    }
}
