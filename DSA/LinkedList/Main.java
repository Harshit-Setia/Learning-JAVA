public class Main {
    public static void main(String[] args) {

        //SinglyLinkedList
        LinkedList list1=new SinglyLinkedList();
        
        System.out.println("SinglyLinkedList");
        // list1.show();
        list1.insertLast(40);
        list1.insertAt(0, 20);
        list1.insertFirst(10);
        list1.insertAt(2, 30);
        list1.insertAt(2, 25);
        list1.removeFirst();
        list1.removeLast();
        list1.insertFirst(10);
        list1.removeAt(1);
        list1.insertAt(1, 20);
        // System.out.println(list1.get(0));
        // System.out.println(list1.get(1));
        // System.out.println(list1.get(2));
        // System.out.println(list1.getSize());
        // list1.show();
        // list1.reverse();
        // System.out.println(list1.contains(25));
        // System.out.println(list1.indexOf(25));
        list1.show();
        
        //DoublyLinkedList
        LinkedList list2=new DoublyLinkedList();

        System.out.println("DoublyLinkedList");
        // list2.show();
        list2.insertLast(40);
        list2.insertAt(0, 20);
        list2.insertFirst(10);
        list2.insertAt(2, 30);
        list2.insertAt(2, 25);
        list2.removeFirst();
        list2.removeLast();
        list2.insertFirst(10);
        list2.removeAt(1);
        list2.insertAt(1, 20);
        // System.out.println(list2.get(0));
        // System.out.println(list2.get(1));
        // System.out.println(list2.get(2));
        // System.out.println(list2.getSize());
        // list2.show();
        // list2.reverse();
        // System.out.println(list2.contains(25));
        // System.out.println(list2.indexOf(25));
        list2.show();

        //CircularLinkedList
        // pending
    } 
}
