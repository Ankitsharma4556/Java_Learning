
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner myNum = new Scanner(System.in);
        int sub1, sub2, sub3, sub4, sub5;
        double result;

        System.out.println("This program will give the % of the student ");
        System.out.print("Enter sub1 marks: ");
        sub1 = myNum.nextInt();
        System.out.print("Enter sub2 marks: ");
        sub2 = myNum.nextInt();
        System.out.print("Enter sub3 marks: ");
        sub3 = myNum.nextInt();
        System.out.print("Enter sub4 marks: ");
        sub4 = myNum.nextInt();
        System.out.print("Enter sub5 marks: ");
        sub5 = myNum.nextInt();

        result = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        System.out.println("The result of the student is: " + result + "%");

    }
}
