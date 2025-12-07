public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ll=new SinglyLinkedList();
        
        ll.show();
        ll.insertLast(40);
        ll.insertAt(0, 20);
        ll.insertFirst(10);
        ll.insertAt(2, 30);
        ll.insertAt(2, 25);
        ll.removeFirst();
        ll.removeLast();
        ll.insertFirst(10);
        ll.removeAt(1);
        ll.insertAt(1, 20);
        System.out.println(ll.get(0));
        System.out.println(ll.get(1));
        System.out.println(ll.get(2));
        System.out.println(ll.getSize());
        ll.show();
        ll.reverse();
        System.out.println(ll.contains(25));
        System.out.println(ll.indexOf(25));
        ll.show();
    } 
}
