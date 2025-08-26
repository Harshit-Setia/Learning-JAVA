import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> ls=Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> p=n->n%2==0;
        Function<Integer,Integer> f=n->n*2;


        Stream<Integer> s1=ls.stream();
        Stream<Integer> s2=s1.filter(p);
        Stream<Integer> s3=s2.map(f);
        int result=s3.reduce(0,(c,e)->c+e);
        System.out.println(result);
        
        //Chaining all operations in a single line
        int result2=ls.stream()
                      .filter(n->n%2==0)// operates on strem of integers
                      .map(n->n*2)  // operates on stream of integers returned by filter
                      .reduce(0,(c,e)->c+e); // operates on stream of integers returned by map
        System.out.println(result2);
    }
}
