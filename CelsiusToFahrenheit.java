/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sadman.celsiumtofahrenheit;

import java.util.Scanner;


public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Celsius value to convert in fahrenheit: ");
        double celsius,fahrenheit;
        
        celsius = input.nextDouble();
        
        fahrenheit=(celsius*9/5)+32; 
        System.out.println(celsius + " celsius in fahrenheit is "+fahrenheit);
    }
}
