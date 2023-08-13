package abstractclass;

public abstract class Vehicle {
    String type,model;
    int maxspeed;

    public Vehicle (String type,String model){
        this.type = type;
        this.model = model;
    }

    public void print(){
        System.out.println("Type: " + this.type);
        System.out.println("Model: " + this.model);
    }

    public void start(){
        System.out.println("Vehicle has started!");
    }

    public void stop(){
        System.out.println("Vehicle has stopped");
    }

    public abstract int getMaxSpeed(int maxspeed);
}
