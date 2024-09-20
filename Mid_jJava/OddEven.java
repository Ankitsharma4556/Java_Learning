/* Write a method that takes an integer as a parameter and returns a boolean indicating whether the number is even or odd. */

public  class OddEven {
    static Boolean NumCheck(int x) {
        if (x % 2 == 0) {
            return true;
        } 
        else {
            return false;
        }
    }
    public static void main(String[] args) {

        //Test the code--

        System.out.println(NumCheck(100));
        System.out.println(NumCheck(221));
        System.out.println(NumCheck(0));
        System.out.println(NumCheck(24));

    }
}