class Computer{
    public void show1(){
        System.out.println("in super");
    } 
}
class Laptop extends Computer{
    public void show2(){
        System.out.println("in sub");
    }
}

public class Casting {
    public static void main(String[] args) {
        Computer obj=new Laptop(); // auto upcasting
        obj.show1();

        // obj is type of Computer so it not has access to methods of Laptop 
        // obj.show2(); 

        Laptop obj2= (Laptop) obj;// downcasting 
        obj2.show1();
        obj2.show2();
    }
}
