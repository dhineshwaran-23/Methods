import java.util.Scanner;

public class FunFactorial {
    static void Fact(int n){
        int  fact= 1;
        if(n==0 || n==1){
            System.out.println("The Factorial Of the Number is :"+ fact);
            return;
        }
        for(int i=1; i<=n; i++){
             fact = fact * i;
        }
        System.out.println("The Factorial of the Number is :"+ fact);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = sc.nextInt();
        Fact(n);
    }
}

