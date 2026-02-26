import java.util.Scanner;

public class FunEvenOdd {
    static void Even(int n){
        if(n % 2==0){
            System.out.println("The given Number is Even: "+ n);
        }
    }
    static void Odd(int n){
        if(n % 2!=0){
            System.out.println("The given number is Odd: "+ n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        Even(n);
        Odd(n);
    }
}
