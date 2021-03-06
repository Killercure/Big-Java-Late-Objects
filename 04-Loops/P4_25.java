/*A simple random generator is obtained by the formula
r new = (a ⋅ r old + b) % m
and then setting r old to r new . If m is chosen as 2 32 , then you can compute
r new = a ⋅ r old + b
because the truncation of an overflowing result to the int type is
equivalent to computing the remainder.
Write a program that asks the user to enter a seed value for r old .(Such a value is often
called a seed). Then print the first 100 random integers generated by this formula,
using a = 32310901 and b = 1729.*/

import java.util.Scanner;

public class P4_25 {
    public static void main(String[] args) {
        final int a = 32310901;
        final int b = 1729;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a seed: ");
        int seed = input.nextInt();
        System.out.print("Please enter m: ");
        int m = input.nextInt();

        for (int i = 0; i < 100; i++) {
            int newValue = (a * seed + b) % m;
            System.out.println(newValue);
            seed = newValue;
        }

        input.close();
    }
}