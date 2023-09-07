/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// Logical AND assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fulent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview

package firsta.assignment_8_logical_andor;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Assignment_8_logical_AndOr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ans1,ans2;
        System.out.println("Have you completed your masters");
        ans1=input.next().charAt(0);
    
        System.out.println("Are you fulent in English?");
        
        ans2=input.next().charAt(0);
        
        
        
        if(ans1=='Y'||ans1=='y' && ans2=='Y'||ans2=='y'){
            System.out.println("You are eligible for apply");
        }
        /*else if (ans1=='n'||ans1=='N'&& ans2=='N'||ans2=='n'){
            System.out.println("You are not eligible for apply");
        }*/
        else{
            System.out.println("wrong input");
        }
    }
    
}
