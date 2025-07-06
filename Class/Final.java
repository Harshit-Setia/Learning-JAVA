
// this class can't be inherited
/*final*/ class Test{

    // in subclass this method can't be override
    final void show(){
        System.out.println("By Harshit");
    }
}

class Test2 extends Test{
    // void show(){

    // }
}
public class Final {
    public static void main(String[] args) {
        // makes constant variable
        final int num=8;
        // num=9;
        System.out.println(num);
    }
}
