/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package firsta.odd_or_even;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Odd_or_even {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Emter Integer Number: ");
        
      
        num=input.nextInt();
        
        if(num%2==0){
            System.out.println("Even Number");
        }
        
        else{
            System.out.println("Odd Number");
        }
    }
}
