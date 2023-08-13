import myfirstpackage.*;
// import java.util.*;

public class packagetester {
    public static void main(String[] args){
        Calucu a = new Calucu();
        System.out.println(a.add(1, 2));
        System.out.println(a.sub(3, 4));
        System.out.println(a.multiply(10,20));
        System.out.println(a.divide(10.0, 50.0));
    }
}