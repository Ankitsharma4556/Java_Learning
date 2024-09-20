public class Myfunc {
    static void myAge(int age){
        if (age >= 18) {
            System.out.println("Yes great your age is above 18 and you are eligible");
        }
        else {
            System.out.println("Sorry you don't meet the minimum age criteria");
        }
    }

public static void main(String[] args) {
    myAge(16);
    myAge(18);
    myAge(-18);
    myAge(20);
}
}