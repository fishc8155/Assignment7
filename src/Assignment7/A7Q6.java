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
public class A7Q6 {
public void lastDigit(int x){
    int lDigit = x % 10;
    if(lDigit < 0){
        lDigit = lDigit * -1;
       
        
    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       A7Q6 test = new A7Q6();
       
        System.out.println("Enter any number");
        int number = in.nextInt();
        
        test.lastDigit(number);
        System.out.println("The last digit is " + number);
                
        
        
    }
}
