public class ArrayQueue implements Queue{
    int size;
    int qu[];
    int n;

    public ArrayQueue(){
        this(10);
    }

    public ArrayQueue(int n){
        size=0;
        this.n=n;
        qu=new int[n];
    }

    public int getSize(){
        return size;
    }

    void reSize(){
        n+=n/2;
        int temp[]=new int[n];
        for(int i=0;i<size;i++){
            temp[i]=qu[i];
        }
        qu=temp;
    }

    public void push(int data){
        if(size==n)reSize();

        qu[size]=data;
        size++;
    }

    public int top(){
        if(size==0)return -1;

        return qu[0];
    }

    public int pop(){
        if(size==0)return -1;

        int temp=qu[0];

        for(int i=1;i<size;i++){
            qu[i-1]=qu[i];
        }
        size--;
        return temp;
    }

    public boolean isEmpty(){
        return size==0;
    }
}