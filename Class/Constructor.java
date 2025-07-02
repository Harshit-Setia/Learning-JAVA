class People{
    private int age;
    private String name;

    // default constructor
    public People(){
        age=12;
        name="Jhon";
    }
    // parameterized constructor
    public People(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }  
}
public class Constructor {
    public static void main(String[] args) {
        People h1=new People();// default constructor is called
        People h2=new People(20,"Harshit");// parameterized constructor is called

        System.out.println(h1.getName()+" : "+h1.getAge());
        System.out.println(h2.getName()+" : "+h2.getAge());
    }
}
