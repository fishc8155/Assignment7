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
public class A7Q2 {
public void examGrade(int failOrPass){
  if(failOrPass < 50){  
      System.out.println("Overall grade is an F");
  
  }
  
  if(failOrPass == 50 - 59 ){
      System.out.println("Overall grade is a D"); 
  }
  
  if(failOrPass == 60 - 69 ){
      System.out.println("Overall grade is a C");
  }
  
  if(failOrPass == 70 - 79){
      System.out.println("Overall grade is a B");
  }
  
  
  if(failOrPass == 80 - 100){
      System.out.println("Overall grade is an A");
  } 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A7Q2 test = new A7Q2();
        Scanner in = new Scanner(System.in);
        
        // ask for mark
        System.out.println("Please enter any mark on the exam");
        int mark = in.nextInt();
        
        test.examGrade(mark);
    }
}
