public class StringBuilderBufffer {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        StringBuilder sb2=new StringBuilder();
        // default capacity 16
        System.out.println(sb1.capacity()+" "+sb2.capacity());
    }
}
