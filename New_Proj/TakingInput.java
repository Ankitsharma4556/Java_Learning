import java.util.Scanner;
public class TakingInput{
    public static void main(String[] args) {
        //This code will take user input and sum it:

        int a,b;

        Scanner Ui = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        a = Ui.nextInt();

        System.out.print("Enter second Number: ");
        b = Ui.nextInt();
        
        int sum = (a+b);
        System.out.println("The sum of the two numbers is " + sum);
    }
}