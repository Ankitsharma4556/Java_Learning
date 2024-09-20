public class Day3{

    public static void myfunc1(String name) {
        System.out.println("My 1st function called " + (name));
    }


    public static int myfunc(int x, int y){
        return (x + y);
    }
    public static void main(String... args){

        myfunc1("Ankit");

      int z =   myfunc(100,200);
      System.out.println(z);

    }
}