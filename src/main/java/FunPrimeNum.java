import java.util.Scanner;

public class FunPrimeNum {
    static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("The give Number is not Prime Number: ");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("The Number is not Prime Number: " + n);
                return;
            }
        }
            System.out.println("The Number is Prime Number: " + n);
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        checkPrime(n);
    }
}
