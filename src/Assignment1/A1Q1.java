/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author fishc8155
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City kw = new City();
         Robot cole = new Robot(kw,0,2,Direction.WEST);
         new Wall(kw,1,1,Direction.NORTH);
         new Wall(kw,1,1,Direction.SOUTH);
         new Wall(kw,1,1,Direction.EAST);
         new Wall(kw,1,1,Direction.WEST);
         
         cole.move();
         cole.move();
         cole.turnLeft();
         cole.move();
         cole.move();
         cole.turnLeft();
         cole.move();
         cole.move();
         cole.turnLeft();
         cole.move();
         cole.move();
         cole.turnLeft();
         
         
         
    }
}
