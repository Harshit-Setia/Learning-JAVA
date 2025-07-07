// object class is extended by default
class Car /* extends Object */ {
    String name;
    double speed;
    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    //these methods are overriden from object class
    // it hashes info of object
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(speed);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    
    // checkes if to given objects are equal or not
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
            return false;
        return true;
    }
    
    // returns string of object data
    public String toString() {
        return "Car [name=" + name + ", speed=" + speed + "]";
    }

    
}

public class ObjectClass {
    public static void main(String[] args) {
        Car obj1=new Car("Hyundai",70);
        Car obj2=new Car("Honda",60);

        System.out.println(obj1.equals(obj2));
        System.out.println("Obj1: "+obj1);
        System.out.println("Obj1 HashCode : "+obj1.hashCode());
        System.out.println("Obj2: "+obj2);
        System.out.println("Obj2 HashCode : "+obj2.hashCode());
    }
}
