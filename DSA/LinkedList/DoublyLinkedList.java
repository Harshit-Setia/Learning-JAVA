public class DoublyLinkedList implements LinkedList {
    class ListNode {
        int data;
        ListNode next;
        ListNode prev;

        public ListNode(){}

        public ListNode(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    private int size;
    private ListNode head;
    private ListNode tail;

    public DoublyLinkedList(){
        size=0;
        head=tail=null;
    }

    public int getSize(){
        return size;
    }

    public void insertFirst(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }

    public void insertLast(int data){
        ListNode newNode=new ListNode(data);
        if(tail==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }

    public void insertAt(int idx,int data){
        if(idx<0||idx>size){
            System.out.println("Enter valid index 0-"+size);
            return;
        }

        if(idx==0){
            insertFirst(data);
            return;
        }
        
        if(idx==size){
            insertLast(data);
            return;
        }

        ListNode newNode=new ListNode(data);
        ListNode temp=head;
        while(idx!=0){
            temp=temp.next;
            idx--;
        }
       
        newNode.next=temp;
        newNode.prev=temp.prev;
        temp.prev.next=newNode;
        temp.prev=newNode;
        size++;
    }

    public void removeFirst(){
        if(size!=0){
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
                head.prev=null;
            }
            size--;
        }
    }

    public void removeLast(){
        if(size!=0){
            if(head==tail){
                head=tail=null;
            }else{
                tail=tail.prev;
                tail.next=null;
            }
            size--;
        }
    }

    public void removeAt(int idx){
        if(idx<0||idx>=size){
            System.out.println("Enter valid index 0-"+size);
            return;
        }
        if(idx==0){
            removeFirst();
            return;
        }
        if(idx==size-1){
            removeLast();
            return;
        }

        ListNode temp=head;
        while(idx!=0){
            temp=temp.next;
            idx--;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        size--;
    }

    public int get(int idx){
        if(idx<0||idx>=size){
            System.out.println("Enter valid index 0-"+size);
            return -1;
        }

        ListNode temp=head;
        while(idx!=0){
            temp=temp.next;
            idx--;
        }

        return temp.data;
    }

    public void reverse(){
        if(size<2)return;

        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        ListNode temp=tail;
        tail=head;
        head=temp;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean contains(int data){
        ListNode temp=head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    
    public int indexOf(int data){
        
        ListNode temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==data){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public void show(){
        System.out.print("null");
        ListNode temp=head;
        while(temp!=null){
            System.out.print("<->"+temp.data);
            temp=temp.next;
        }
        System.out.println("<->"+null);
    }

}
