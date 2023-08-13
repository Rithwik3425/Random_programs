import nestedclass.InnerClassExample;
public class InnerTest {
    public static void main(String[] args) {
        InnerClassExample outer = new InnerClassExample();
        InnerClassExample.InnerClass inner = outer.new InnerClass();
        // InnerClassExample.InnerClass inner = new InnerClassExample.InnerClass();This is not working 
        inner.show();
    }
}
