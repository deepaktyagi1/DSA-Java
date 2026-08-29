package OOPs;

public class Car extends Vehicle{

    int noOfDoors;
    String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
       super(name, model, noOfTyres);
       this.noOfDoors = noOfDoors;
       this.transmissionType = transmissionType;
    }

    void startAc(){
        System.out.println("start AC " + name);
    }

}