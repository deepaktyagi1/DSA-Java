package OOPs;

public class Vehicle {
    String name;
    String model;
    int noOfTyres;

    Vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model =model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.println("start engine"+ name);
    }

    void stopEngine(){
        System.out.println("stop engine"+ name);
    }
    
}
