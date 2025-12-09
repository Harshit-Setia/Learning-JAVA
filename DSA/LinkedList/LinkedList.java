public interface LinkedList {

    // gives size of ll
    int getSize();

    //insert functions
    void insertFirst(int data);//insert at first
    void insertLast(int data);//insert at last
    void insertAt(int idx,int data);//insert at index

    //remove functions
    void removeFirst();//remove from first
    void removeLast();//remove from last
    void removeAt(int idx);//remove from index

    //gets element at any index
    int get(int idx);

    //reverse ll
    void reverse();

    //check if list is empty
    boolean isEmpty();

    //check if data is in ll
    boolean contains(int data);

    //gets index of data
    int indexOf(int data);

    //display ll
    void show();
}
