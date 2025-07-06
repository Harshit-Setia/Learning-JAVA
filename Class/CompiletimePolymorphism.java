public class CompiletimePolymorphism {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {

        // wich method will be called is decided at compiletime
        System.out.println(add(4, 3));
        System.out.println(add(1, 2, 3));
    }
}
