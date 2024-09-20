
public class SimpCalc {

    public static int calc(int x, int y, int c) {
        switch (c) {
            // Addition
            case 1:
                return x + y;

            case 2: // Subtraction

                return x - y;

            case 3: // Multiplication

                return x * y;

            case 4: //Division
                if ((x != 0) || (y != 0)) {
                    return x / y;
                } 
                else {
                    return 0;
                }
                
            default: 
                System.out.println("No valid Selection");
                return 0;
        }
    }

    public static void main(String[] args) {        

        System.out.println(calc(24,24,1));

    }
}
