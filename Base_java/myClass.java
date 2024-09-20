class House {
        int rooms;
        String colour;
    }

public class myClass{

  
    public static void main(String[] args) {

        House myHouse = new House();
        myHouse.rooms = 10;
        myHouse.colour = "Red";

        House newHouse = new House();
        newHouse.rooms = 20;
        newHouse.colour = "Green";
        
    int x = newHouse.rooms;
    String y = myHouse.colour;
    System.out.println(x);
    System.out.println(y);
    }

    
}

//53 reserved words