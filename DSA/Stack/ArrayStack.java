public class ArrayStack implements Stack{
    private int size;
    private int[] st;
    int n;

    public ArrayStack(){
        this(10);
    }
    public ArrayStack(int n){
        size=0;
        this.n=n;
        st=new int[n];
    }


    public int getSize(){
        return size;
    }

    private void reSize(){
        n+=n/2;
        int temp[]=new int[n];

        for(int i=0;i<size;i++){
            temp[i]=st[i];
        }
        st=temp;
    }

    public void push(int data){
        if(size==n){
            reSize();
        }
        st[size++]=data;
    }

    public int top(){
        if(size==0){
            return -1;
        }
        return st[size-1];
    }

    public int pop(){
        if(size==0){
            return -1;
        }
        return st[--size];
    }

    public boolean isEmpty(){
        return size==0;
    }
}