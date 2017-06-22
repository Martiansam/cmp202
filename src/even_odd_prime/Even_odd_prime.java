/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even_odd_prime;

/**
 *
 * @author Sammy
 */
import java.util.Scanner;
public class Even_odd_prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        int a;
        int num;
        boolean isPrime=true;
        
        System.out.println("Input value for check : ");
        num = input.nextInt();
        
        for (int i=2; i<=num/2;i++) {
        
            a=num%i;
            if(a==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
        
        if (num % 2 == 0)
        {
            System.out.println(num + " is an even number");
        }
        
        else 
        {
            System.out.println(num + " is an odd ");
        }
    }
    
}
