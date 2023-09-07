/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

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
