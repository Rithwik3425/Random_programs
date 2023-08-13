class Vehicle{
    String type,model;
    int maxspeed;
    public void print(){
        System.out.println("Type: "+type);
        System.out.println("Model: "+ model);
        System.out.println("Max Speed: " +maxspeed );
    }
}

class Car extends Vehicle{

}

class Motorcyle extends Vehicle{

}

public class InheritanceTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.type = "Car";
        car.model ="BMW X5";
        car.maxspeed= 200 ;
        Motorcyle moto =new Motorcyle() ;
        moto.type="MotorCycle" ;
        moto.model="Harley Davidson";
        moto.maxspeed=180 ;

        car.print();
        System.out.println("\n");
        moto.print();
    }    
}