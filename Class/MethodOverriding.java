class Parent{
    public void show(){
        System.out.println("in Parent");
    }
}
class Child extends Parent{
    // if shpw is called this method will execute
    public void show(){
        System.out.println("in Child");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.show();
    }
}
