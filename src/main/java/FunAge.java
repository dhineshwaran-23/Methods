import java.util.Scanner;

public class FunAge {
    static void Age(int age){
        if(age >= 18){
            System.out.println("Eligible for voting: "+ age);
        }else {
            System.out.println("Not Eligible for voting: "+ age);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age: ");
        int age = sc.nextInt();
        Age(age);
    }
}
