import java.util.Scanner;

public class FunPythagorean {
    static void pythagoreanTriplet(int a, int b, int c) {
        int max;
        if (a >= b && a >= c) {
             max = a;
        } else if (b >= a && b >= c) {
            max = b;
        }else {
            max = c;
        }
        int x;
        int y;
        if(max == a){
            x = b;
            y = c;
        }else if(max == b){
            x = a;
            y = c;
        }else{
            x = a;
            y = b;
        }
        if(x*x + y*y == max*max){
            System.out.println("Pythagorean Triplet ");
        }else{
            System.out.println("Not a Pythagorean Triplet ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Number : ");
        int c = sc.nextInt();
        pythagoreanTriplet(a , b, c);
    }
}
