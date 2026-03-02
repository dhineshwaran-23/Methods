import java.util.Scanner;

public class FunPalindrome {
    static void checkPalindrome(int n){
        int Original = n;
        int Reverse = 0;
        while (n>0){
            int digit = n % 10;
            Reverse = Reverse * 10 + digit;
            n = n / 10;
        }
        if(Original == Reverse){
            System.out.println("The Given Number is Palindrome: "+Original);
        }else {
            System.out.println("The Given Number is Not Palindrome: "+ Original);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        checkPalindrome(n);
    }
}
