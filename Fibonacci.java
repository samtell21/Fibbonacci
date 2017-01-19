
package fib;

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        fib(n, 0, 0, 1);
    }
    
    private static void fib(int n, int i, int f, int j)
    {
        if(i < n)
        {   System.out.println(j);
            int k = f + j;
            i++;
            fib(n,i,j,k);
        }
        else    System.exit(0);
        
        
    }
    
}
