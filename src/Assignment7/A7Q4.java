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
public class A7Q4 {
    
public double compoundinterest(double x, double y, double z){
    double compound =  (1 + y);
    double interest = Math.pow(compound, z);
    double m = interest * x;
    
    double xx = m * 100;
    double yy = Math.round(xx);
    double a = yy / 100;
    
    return a;
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A7Q4 test = new A7Q4();
        
        // ask for starting amount
        System.out.println("What is the starting amount?");
        double amount = in.nextDouble();
        //ask for interest rate
        System.out.println("What is the interest rate?");
        double rate = in.nextDouble();
        //ask for # of years
        System.out.println(" How many years does this take place over?");
        double years = in.nextDouble();
        
        double interestCompounded = test.compoundinterest(amount, rate, years);       
        // print final answers 
        System.out.println("The final compound interest is " + interestCompounded);
        
        
    }
}
