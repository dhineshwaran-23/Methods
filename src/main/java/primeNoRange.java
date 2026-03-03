import java.util.Date;
import java.util.Scanner;

public class primeNoRange {
    static void primeNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (num <= 1) {
                System.out.println("The number is not Prime Number: " + num);
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The Prime Number are: " + num);
            } else {
                System.out.println("The Number is Not Prime : " + num);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Starting Number: ");
        int start = sc.nextInt();
        System.out.print("Enter the Ending Number: ");
        int end = sc.nextInt();
        primeNumber(start, end);
    }
}
