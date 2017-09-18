/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments4;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;


/**
 *
 * @author gavra1029
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City alexendoor=new City ();
        //new wall
        new Wall(alexendoor,0,1,Direction.WEST);
        new Wall(alexendoor,1,1,Direction.WEST);
        new Wall(alexendoor,1,1,Direction.SOUTH);
        Robot ob = new Robot(alexendoor,0,0,Direction.SOUTH);
        Robot bob = new Robot(alexendoor,0,1,Direction.SOUTH);
    }
}
