public class TableOf {

    static void tableOf(int n,int i){
        if(i<1)return;

        tableOf(n, i-1);
        System.out.println(n+" X "+i+" = "+n*i);
    }
    public static void main(String[] args) {
        tableOf(6, 20);
    }
}
