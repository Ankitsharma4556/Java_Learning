class Car{
    String brandName, model, colour;
}
public class Main{
  public static void main(String[] args) {
    Car car1 = new Car();

    car1.brandName = "Toyota";
    car1.model = "1987";
    car1.colour = "Green";

    System.out.println(car1.brandName);
    System.out.println(car1.colour);
    System.out.println(car1.model);
    System.out.println(car1.brandName.length());
      
  }  
}