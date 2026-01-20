public class Main {
    public static void main(String[] args) {
        Queue q=new ArrayQueue();
        // Queue q=new LinkedListQueue();

        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.top());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.isEmpty());
    }
}
