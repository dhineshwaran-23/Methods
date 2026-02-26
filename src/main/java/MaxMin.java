import java.util.Scanner;

public class MaxMin {
    static void findMax(int a,int b,int c){
        int max = a;
        if(b > max){
            max = b;
        }if(c > max){
            max = c;
        }
        System.out.println(" The Maximum Number is: "+ max);

    }
    static void findMin(int a,int b,int c){
        int min = a;
        if(b < min){
            min = b;
        }if(c < min){
            min = c;
        }
        System.out.println(" The Minimum Number is: "+ min);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num1: ");
        int a = sc.nextInt();
        System.out.print("Enter the Num2: ");
        int b = sc.nextInt();
        System.out.print("Enter the Num3: ");
        int c = sc.nextInt();
        findMax(a , b ,c);
        findMin(a, b ,c);
    }
}
