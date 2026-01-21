public class OneToNEven {

    static void print(int n){
        if(n<1)return;

        print(n-1);
        if(n%2==0)System.out.println(n);
    }

    public static void main(String[] args) {
        print(20);

    }
}
