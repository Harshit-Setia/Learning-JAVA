public class LinkedListQueue implements Queue {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    LinkedListQueue(){
        head=tail=null;
        size=0;
    }

    public int getSize(){
        return size;
    }

    public void push(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=tail.next;
        }
        size++;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }
        size--;
        int data=head.data;
        head=head.next;
        return data;
    }

    public int top() {
        if(isEmpty())return -1;
        return head.data;
    }

    
}
