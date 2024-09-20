//Write a method to calculate the factorial of a number using both loops and recursion.

public class Fact {

    static int fact(int x){
        if (x == 0) {
            return 1;
        }
        else {
            return x * fact(x-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.println(fact(2));
        System.out.println(fact(10));
        
    }
}