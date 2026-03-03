package org.example;

import java.util.Scanner;

public class FunNaturalNum {
    static void naturalNum(int n){
        int sum = 0;
        for (int i=1 ; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("The Sum of Natural Number is : "+ sum);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        naturalNum(n);
    }
}
