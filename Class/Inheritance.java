class A{
    void funcA(){
        System.out.println("in a");
    }
}
class B extends A{// single level Inheritance
    // methods of A are inherited in B
    void funcB(){
        System.out.println("in b");
    }
}
class C extends B{// multi level Inheritance
    // methods of B&A are inherited in C
    void funcC(){
        System.out.println("in c");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        A objA=new A();
        objA.funcA();
        B objB=new B();
        objB.funcA();
        objB.funcB();
        C objC=new C();
        objC.funcA();
        objC.funcB();
        objC.funcC();
    }
}
