public class TenToN {

    static void print(int n){
        if(n<10)return;

        print(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        print(20);
        System.out.println();
    }
}
