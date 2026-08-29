package OOPs;

public class Motorcycle extends Vehicle{

    String handlebarStyle;
    String suspensionType;

    Motorcycle (String name, String model, int noOfTyres,String handlebarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handlebarStyle = handlebarStyle;
        this.suspensionType= suspensionType;
    }

    void wheelie(){
        System.out.println("Motorcyle Wheeeliee" + name);
    }
    
}