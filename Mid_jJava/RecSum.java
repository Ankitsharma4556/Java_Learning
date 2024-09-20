public class RecSum{

    static int sum(int n){
        if (n > 0) {
           return n + sum (n-1);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {

        System.out.println(sum(5));
        System.out.println(sum(10));
        System.out.println(sum(15));
    }
}