import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(64);
        list.add(96);
        list.add(29);
        list.add(71);
        list.add(45);
        list.add(22);

        System.out.println("List: "+list);
        Comparator<Integer> c=(int1,int2)->{
            if(int1%10>int2%10){
                return 1;
            }
            else return -1;
        };
        Collections.sort(list,c); //sorting acording to last value
        System.out.println("SortedList: "+list);

        Collections.sort(list,(obj1,obj2)->obj2-obj1); //reverse order
        System.out.println("ReverseSortedList: "+list);
    }
}
