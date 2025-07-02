class Human{
    // private variables can't be aceesed outside object
    private int age;
    private String name;

    // methods to access private variables outside object
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    
}

public class Encapsulation {
    public static void main(String[] args) {
       Human h1=new Human();
       h1.setAge(20);
       h1.setName("Harshit");
       System.out.println(h1.getName()+" : "+h1.getAge());
    }
}
