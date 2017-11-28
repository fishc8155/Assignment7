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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //inport new scanner
        Scanner in = new Scanner(System.in);

        
        int[] marksOrder = new int[10];

        //ask user for 10 marks
        System.out.println("Please enter 10 marks");

        
        //get all the marks
        for (int a = 0; a < 10; a++){ 
        marksOrder[a] = in.nextInt(); 
        }

        for (int x = 0; x < 10; x++) {
            for (int i = 0; i < 9; i++) { 
                if (marksOrder[x] < marksOrder[i]) { 
                    int temp = marksOrder[i]; 
                    marksOrder[i] = marksOrder[x]; 
                    marksOrder[x] = temp; 
                }else{
                    
                }
            }
        }
        
        ascending(marksOrder); 
    }
    public static void ascending(int[] marks){
        System.out.print("The numbers in ascending order are: ");
        
        for (int i = 0; i < 10; i++){ 
            //output marks
            System.out.print(marks [i] + " "); 
        }  
        
    }
}
    

