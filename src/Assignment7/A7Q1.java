/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author fishc8155
 */
public class A7Q1 {
public double circleArea(double x){
    double formulaEquals = 3.14 * (x * x);
    return formulaEquals;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        A7Q1 test = new A7Q1();
        
        
        // ask for radius
        System.out.println("Please enter the radius of the circle");
        double radius = input.nextDouble();
        
        // calculate area
        double area = test.circleArea(radius);
        System.out.println("The area of the circle is " + area);
        
        
    }
}
