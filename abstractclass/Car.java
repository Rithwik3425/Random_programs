package abstractclass;

public class Car extends Vehicle {

    public Car(String type, String model) {
        super(type, model);
    }

    @Override
    public int getMaxSpeed(int maxspeed) {
        super.maxspeed = maxspeed;
        System.out.println("Max speed of the car is " + maxspeed);
        return maxspeed;
    }

    @Override
    public void print(){
        super.print();
    }

    @Override
    public void start(){
        // super.start();
        System.out.println("Car has started!");
    }

    @Override
    public void stop(){
        // super.stop();
        System.out.println("Car has stopped");
    }
}
