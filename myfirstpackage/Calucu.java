package myfirstpackage;

public class Calucu {
    public int add(int x,int y){
        return (x+y);
    }
    public int sub(int x,int y){
        return (x-y);
    }
    public int multiply(int  a, int b){
        return (a*b) ;
    }
    public double divide(double x, double y ){
        if(y==0.0){
            System.out.println("Cannot divide");
            return -1.0;
        }
        else{
            return ((float)(x/y));
        }
    }
}