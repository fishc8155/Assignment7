/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author fishc8155
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        // make array
        int [] numbers = new int[2];
        
        // tell user to input two numbers
        System.out.println("Please enter two numbers");
        
        
        //create loop
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            
        }
        
        
        // create loop
        if(numbers[0] > numbers[1]){
             System.out.println("The numbers in ascending order are: " + numbers[1] + ", " + numbers[0]);  
             
        }else{
            
            System.out.println("The numbers in ascending order are: " + numbers[0] + ", " + numbers[1]);
        }
        
        
        
                
        
        
        
    }
}
