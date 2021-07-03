
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhosep_PC
 */
public class OlderThanThat {
    public static void main (String args[]){
        
        Scanner scan = new Scanner(System.in);
            
        System.out.println("Proporciona el numero1: ");
        int firstNumber = Integer.parseInt(scan.nextLine());
        
        System.out.println("Proporciona el numero2: ");
        int secondNumber = Integer.parseInt(scan.nextLine());
        
        int result = (firstNumber > secondNumber) ? firstNumber  : secondNumber ;
        
        System.out.println("El numero mayor es: \n" + result);
    }
    
}
