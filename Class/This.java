class Person{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // this is used to reffer to objet which has called method
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; // this.name(object variable) , name(local variable)
    }  
}
public class This {
    public static void main(String[] args) {
        Person h1=new Person();
        h1.setAge(20);
        h1.setName("Harshit");
        System.out.println(h1.getName()+" : "+h1.getAge());
    }
}
