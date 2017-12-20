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
public class A7Q5 {
public void asterisks (int x){
    for(int i = 0; i < x; i ++){
        // get a random number
        int random = (int)(Math.random()*(5 - 1 + 1))+ 1;
        if (random == 1){
            System.out.println("*");
        }
        if (random == 2){
            System.out.println("**");
        }
        if (random == 3){
            System.out.println("***");
        }
        if (random == 4){
            System.out.println("****");
        }
        if (random == 5){
            System.out.println("*****");
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A7Q5 test = new A7Q5();
        
        System.out.println("Enter any number of columns");
        int columns = in.nextInt();
        
        test.asterisks(columns);
    }
}
