
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gavra1029
 */
public class Quizs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a mine 
        City mine = new City();
        //make a worker called Alex
        Robot Alex = new Robot(mine, 1, 1, Direction.EAST);
        // Make the mines
        new Wall(mine, 1, 1, Direction.WEST);
        new Wall(mine, 1, 3, Direction.NORTH);
        new Wall(mine, 1, 3, Direction.SOUTH);
        new Wall(mine, 1, 4, Direction.NORTH);
        new Wall(mine, 1, 4, Direction.SOUTH);
        new Wall(mine, 1, 5, Direction.NORTH);
        new Wall(mine, 1, 5, Direction.SOUTH);
        new Wall(mine, 1, 5, Direction.EAST);
        //make the debris 
        new Thing(mine, 1, 3);
        new Thing(mine, 1, 4);
        new Thing(mine, 1, 5);
         //make the worker turn back every time he picks up the debris 

        while (Alex.frontIsClear()) {
            Alex.move();
                       
            if (Alex.getAvenue() == 1) {
                Alex.turnLeft();
                Alex.putThing();
                Alex.turnLeft();
                Alex.move();

            }
            if (Alex.canPickThing()) {
                                

                Alex.pickThing();
                Alex.turnLeft();
                Alex.turnLeft();
                while (Alex.getAvenue() != 1) {
                    Alex.move();
                    
                    
                }
//go back outside the mine 
                Alex.putThing();
                Alex.turnLeft();
                Alex.turnLeft();
                
                
            } else {
                if (!Alex.frontIsClear()) {
                    Alex.turnLeft();
                    Alex.turnLeft();
                    
                    

                    while (Alex.getAvenue() != 0) {
                        Alex.move();
                    }
                }
            }
            //the minner goes out of the mine

        }
        Alex.turnLeft();
        Alex.turnLeft();

    }
}
