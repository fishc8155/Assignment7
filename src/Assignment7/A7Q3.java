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
public class A7Q3 {
public void factors(int dividers){
    
} 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner in = new Scanner(System.in);
        A7Q3 test = new A7Q3();
        
        int dividers, i;
		
	// ask user for a number	
        System.out.println("Enter any number to find its factors");
        // store that number
        dividers = in.nextInt();
		
        for(i = 1; i <= dividers; i++) {
	if(dividers % i == 0) {
	System.out.format(" %d  ", i);
                                
        test.factors(dividers);
            
        
            }  
        }
    }
}