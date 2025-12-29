public class Main {
    public static void main(String[] args) {
        Stack st=new LinkedListStack();
        st.push(2);
        st.push(5);
        st.push(1);
        st.push(3);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
