class A{
    public A(){
        System.out.println("in a");
    }
    public A(int n){
        System.out.println("in a int");
    }
}
class B extends A{
    public B(){
        //super(); // called by default
        this(5);
        System.out.println("in b");
    }
    public B(int n){
        super(n);
        System.out.println("in b int");
    }
}

public class Super {
    public static void main(String[] args) {
        B obj=new B();
    }
}
