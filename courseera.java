class mtclass{
    int data;
    String name;

    public String getname(){
        return name;
    }
    public int getid(){
        return data;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setid(int data){
        this.data=data;
    }
    public mtclass(){
        this.data = 45;
        this.name="String";
    }
    public mtclass(String name){
        this.name=name;
    }
    public mtclass(String name,int data){
        this.data=data;
        this.name=name;
    }
}

public class courseera {
    public static void main(String[] args){
        mtclass c = new mtclass();
        System.out.println(c.getid());
        System.out.println(c.getname());
        mtclass c1 = new mtclass("name");
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        mtclass c2 = new mtclass("Rithwik",18);
        System.out.println(c2.getid());
        System.out.println(c2.getname());
 }   
} 