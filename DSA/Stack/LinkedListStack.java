public class LinkedListStack implements Stack{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    int size;

    LinkedListStack(){
        head=null;
        size=0;
    }

    public int getSize(){
        return size;
    }

    public void push(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public int pop(){
        if(size>0){
            size--;
            int temp=head.data;
            head=head.next;
            return temp;
        }
        return -1;
    }

    public int top(){
        if(size>0){
            return head.data;
        }
        return -1;
    }

    public boolean isEmpty(){
        return size==0;
    }
}