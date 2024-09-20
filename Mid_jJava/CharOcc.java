// Write a method that takes a string and a character as input, and returns how many times that character appears in the string.

public class CharOcc {
    static int counts(String x, char y) {
        int count = 0;
        char arr[] = x.toCharArray();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == (y)) {
                count ++;
            }

        }

        return  count;

    }

    public static void main(String[] args) {
       System.out.println(counts("Hello", 'l'));
       System.out.println(counts("Ankit", 'i'));
       System.out.println(counts("Vivek", 'V'));
       System.out.println(counts("Ceceliac", 'c'));


        
    }
}