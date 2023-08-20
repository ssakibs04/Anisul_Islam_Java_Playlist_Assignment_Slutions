/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package firsta.assignment_5_validvoter;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Assignment_5_validvoter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.print("Enter Your Age: ");
         age = input.nextInt();
         
         
         if(age>=18){
             System.out.println("Valid voter");
         }
         else{
             System.out.println("Invalid Voter");
         }
    }
}
