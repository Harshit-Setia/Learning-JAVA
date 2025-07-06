class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        // refrence of any chiled class can be stored in refrence variable is type of parent class
        A obj;
        obj=new A();
        obj.show();
        obj=new B();
        obj.show();
        obj=new C();
        obj.show();
    }
}