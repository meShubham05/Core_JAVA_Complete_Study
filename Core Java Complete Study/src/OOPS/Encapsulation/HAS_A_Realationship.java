package OOPS.Encapsulation;

class Engine {
    int engineNumber;
    String compName;
    double carPrice;
    
    
    Engine(int engineNumber, String compName, double carPrice) {
        this.engineNumber = engineNumber;
        this.compName = compName;
        this.carPrice = carPrice;
    }
}

class Car {
   
    Engine eng;

   
    public void insertEngine(Engine eng) {
        this.eng = eng;
    }


    public void show() {
        System.out.println("Engine number: " + eng.engineNumber);
        System.out.println("Company Name: " + eng.compName);
        System.out.println("Car Price: " + eng.carPrice);
    }
}

public class HAS_A_Realationship {
    public static void main(String[] args) {
        
        Engine e = new Engine(10, "BMW", 20202);

        
        Car c = new Car();
        c.insertEngine(e);

        
        c.show();
    }
}
