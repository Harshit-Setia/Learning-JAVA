// object of abstract class can't be made
abstract class Vehical{
    int topSpped;
    String brand;

    // abstract methods
    // they are only declared not defined
    abstract void setBrand(String brand);
    abstract void setTopSpeed(int topSpped);

    // concrete methods that are declared and defined
    void playMusic(){
        System.out.println("starting music");
    }
    
    public String toString() {
        return getClass()+" [topSpped=" + topSpped + ", brand=" + brand + "]";
    }
}

class Bike extends Vehical{
    public Bike(String brand,int topSpped){
        this.brand=brand;
        this.topSpped=topSpped;
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    void setTopSpeed(int topSpped){
        this.topSpped=topSpped;
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Bike b1=new Bike("Hero",80);
        System.out.println(b1);
    }
}
