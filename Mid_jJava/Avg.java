//Write a method that calculates the average of the elements in an integer array.

public class Avg{
    static double myArray(int[] x){
        int sum = 0;
        for (int i = 0; i < (x.length); i++){
            sum += x[i];
        } 
        return (double)sum/(x.length);
    }
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6};

      System.out.println(myArray(x));
    }
}