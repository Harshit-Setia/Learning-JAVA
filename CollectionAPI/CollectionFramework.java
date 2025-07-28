import java.util.*;


public class CollectionFramework {
    public static void main(String[] args) {
        Collection<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        
        System.out.print("List: ");
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);

        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One"); 
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Fiv");
        map.put(5, "Five");

        System.out.println("Map: "+map);        
    }
}
