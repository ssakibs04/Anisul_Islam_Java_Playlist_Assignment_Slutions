// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english

package firsta.switchstatement;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SwitchStatement {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter your preferable language:\n0.bangla\n1.Hindi \n2.Urdu \n3.English\n");
        
        int enter;
        enter=input.nextByte();
        
        
     switch(enter){
         case 0:
             System.out.println("Bangla");
               break;
         case 1:
             System.out.println("Hindi");
             break;
         case 2:
             System.out.println("Urdu");
               break;
          default:
             System.out.println("English");
        }
    }
}
