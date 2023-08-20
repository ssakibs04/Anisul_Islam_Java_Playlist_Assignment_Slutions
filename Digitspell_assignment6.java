/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package firsta.digitspell_assignment6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Digitspell_assignment6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a digit(0-9): ");
        
        num=input.nextInt();
        
         
        if(num==0){
            System.out.println("ZERO");
        }
        else if(num == 1){
            System.out.println("ONE");
        }
        
        else if(num == 2){
            System.out.println("TWO");
        }
        
        else if(num == 3){
            System.out.println("THREE");
        }
        
        else if(num == 4){
            System.out.println("FOUR");
        }
        
        else if(num == 5){
            System.out.println("FIVE");
        }
        
        else if(num == 6){
            System.out.println("SIX");
        }
        
        else if(num == 7){
            System.out.println("SEVEN");
        }
        
        else if(num == 8){
            System.out.println("EIGHT");
        }
        
        else if(num == 9){
            System.out.println("NINE");
        }
        
        else {
            System.out.println("INVALID");
        }
        
    }
}
