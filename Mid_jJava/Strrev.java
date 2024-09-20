//Write a method that takes a string and returns the reversed string without using any in-built functions.

public class Strrev{
  
    static String strrev(String x){
        String reversed = "";

        for(int i = x.length()-1; i>=0; i--) {
            reversed += x.charAt(i);
        }

        return  reversed;
    
     
        
    }
    public static void main(String[] args) {
       System.out.println( strrev("Hello World"));
       System.out.println( strrev("Renuka"));

    }
}