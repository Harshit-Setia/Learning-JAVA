interface Computer{
    void work();
}
class Laptop implements Computer{
    public void work(){
        System.out.println("Working");
    }
}
class Desktop implements Computer{
    public void work(){
        System.out.println("Working Fast");
    }
}
class Worker{
    public Worker(Computer c){
        c.work();
    }
}
/*
    class extends class
    interface extends interface
    class implements interface
*/
interface zero{
    void z();
}
interface first extends zero{
    int num=0; // all variables are static and final
    void one();// all methods are public abstract
}
interface second{
    void two();
}
// we can implement multiple interface
class third implements first,second{
    public void z(){
        System.out.println("zero");
    }
    public void one(){
        System.out.println("one");
    }
    public void two(){
        System.out.println("two");
    }
}
interface eg{
    void example();
}
// class can extend one class and multiple interface at same time
class four extends third implements eg{
    public void example(){
        System.out.println("eg");
    }
}

public class Interface {
    public static void main(String[] args) {
        Worker w1=new Worker(new Desktop());
        Worker w2=new Worker(new Laptop());
    }
}
