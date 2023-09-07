/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package firsta.assignment_7logicandor;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Assignment_7logicAndOr {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do You Love Java?");
        System.out.println("Press y/y for Yes and n/N for No");
        
        
        char ans;
        ans=input.next().charAt(0);
        
        
        if(ans=='Y' || ans=='y'){
            System.out.println("I Love Java.");
            }
        
        else if(ans=='N'||ans=='n'){
            System.out.println("I dont love Java.");
    }
        
        
        else{
            System.out.println("Wrong Input");
        }
                
        
    }
}
