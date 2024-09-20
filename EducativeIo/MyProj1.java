import java.util.Scanner;

public class MyProj1{
    static void userName() {
    System.out.print("Hi kid, please tell me your name: ");
    Scanner inp = new Scanner(System.in);
    String name = inp.nextLine();

    System.out.println("Hi " + name + ", Welcome to the learning World");
    inp.close();
        

    }
    public static void main(String[] args) {
   userName();
        
    }
}