public class SinglyLinkedList implements LinkedList {
    class ListNode {
        public int data;
        public ListNode next;

        public ListNode(){}

        public ListNode(int data){
            this.data=data;
            next=null;
        }    
    }

    ListNode head;
    private int size;

    public SinglyLinkedList(){
        head=null;
        size=0;
    }

    public int getSize(){
        return size;
    }

    public void insertFirst(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }

    public void insertLast(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
        }
        else{
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;
    }

    public void insertAt(int idx,int data){
        if(idx>size||idx<0){
            System.out.println("enter index in range(0,"+size+") to insert element");
            return;
        }
        ListNode newNode=new ListNode(data);
        int i=0;        
        ListNode prev=null; 
        ListNode curr=head;
    
        while(i<idx){
            prev=curr;
            curr=curr.next;
            i++;
        }

        newNode.next=curr;
        if(prev!=null){
            prev.next=newNode;
        }
        else{
            head=newNode;
        }
        size++;
    }

    public void removeFirst(){
        if(size==0)return;
        head=head.next;
        size--;
    }

    public void removeLast(){
        if(size==0)return;
        if(size==1){
            head=null;
        }
        else{
            ListNode temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
        size--;
    }

    public void removeAt(int idx){
        if(idx<size&&idx>=0){
            if(idx==0){
                removeFirst();
                return;
            }
            if(idx==size-1){
                removeLast();
                return;
            }

            ListNode prev=null;
            ListNode curr=head;
            int i=0;
            while(i<idx){
                prev=curr;
                curr=curr.next;
                i++;
            }
            prev.next=curr.next;
            size--;
        }
        else{
            System.out.println("enter index in range(0,"+size+") to remove element");
        }
    }

    public int get(int idx){
        if(size==0){
            System.out.println("List is Empty");
            return -1;
        }
        if(idx>=size||idx<0){
            System.out.println("enter index in range(0,"+size+") to insert element");
            return -1;
        }
        int i=0;
        ListNode temp=head;
        while(i<idx){
            temp=temp.next;
            i++;
        }
        return temp.data;
    }
    
    public void reverse(){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean contains(int data){
        for(ListNode temp=head;temp!=null;temp=temp.next){
            if(temp.data==data)return true;
        }
        return false;
    }

    public int indexOf(int data){
        ListNode temp=head;
        for(int i=0;i<size;i++){
            if(temp.data==data)return i;
            temp=temp.next;
        }
        return -1;
    }

    public void show(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
