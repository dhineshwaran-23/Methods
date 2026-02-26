import java.util.Scanner;

public class FunSum {
    static void Sum(int n1, int n2){
        int sum = 0;
        sum = n1+n2;
        System.out.println("The Total Sum is : "+ sum);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = sc.nextInt();
        Sum(n1,n2);
    }
}

