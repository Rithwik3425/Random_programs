import abstractclass.Car;

// package abstractclass;

public class Abstract_Class_Text {
    
    public static void main(String[] args) {
        Car car = new Car("Car","Ferrai");
        car.print();
        car.start();
        car.stop();
        car.getMaxSpeed(500);
        // System.out.println(Integer.MAX_VALUE);
        String s = "Tutorials 123";
        // String s = "123";
        for(int i=0; i < s.length(); i++) {
           if((s.charAt(i)) == " "){
                continue;
           }
        }
    }
}
