import java.util.Scanner;

public class FunMark {
    static void Mark(int mark){
        String Grade;
        if(mark >=91 && mark <= 100){
             Grade = "AA";
            System.out.println("The Grade is: "+ Grade);
        } else if (mark >=81 && mark <= 90) {
            Grade = "AB";
            System.out.println("The Grade is: "+ Grade);
        } else if (mark >=71 && mark <= 80) {
            Grade = "BB";
            System.out.println("The Grade is: "+ Grade);
        } else if (mark >=61 && mark <= 70) {
            Grade = "BC";
            System.out.println("The Grade is: "+ Grade);
        } else if (mark >=51 && mark <= 60) {
            Grade = "CD";
            System.out.println("The Grade is: "+ Grade);
        }else if (mark >=41 && mark <= 50) {
            Grade = "DD";
            System.out.println("The Grade is: " + Grade);
        }else {
            Grade = "FAIL";
            System.out.println("The Grade is "+ Grade);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Mark: ");
        int mark = sc.nextInt();
        Mark(mark);
    }
}
