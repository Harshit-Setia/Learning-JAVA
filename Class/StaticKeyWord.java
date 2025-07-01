
class Mobile{
    int price;
    String brand;

    // can be accesed using class name
    static String name;

    // executes once when class is loaded
    static{
        name="mobile";
        System.out.println("Static");
    }

    // executes whenever object of class is created
    Mobile(){
        price=0;
        brand="";
        System.out.println("Obj");
    }

    static void show(Mobile obj){
        // can't use non-static variable in static method as it not has access to variables of object
        // System.out.println(price+" : "+brand);

        System.out.println(obj.price+" : "+obj.brand);
    }
}

public class StaticKeyWord{
    public static void main(String []a)throws ClassNotFoundException{
        // loads class without creating object
        Class.forName("Mobile");
        // System.out.println(Mobile.name);
        // Mobile mb1=new Mobile();


    }
}