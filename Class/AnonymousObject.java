class A{
    public A(){
        System.out.println("object created");
    }
    void show(){
        System.out.println("in a");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        new A();// new object is created
        new A().show();// new object is created and method is called
    }
}
