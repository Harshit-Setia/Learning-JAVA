// FunctionalInterface or SAM (Single Abstract Method) is used for lambda expressions introduced in Java 8
@FunctionalInterface
interface Calculator {
    int op(int a, int b);
}

@FunctionalInterface
interface Log {
    void output(int data);
}

public class FunctionalInterfaceSAM {
    public static void main(String[] args) {
        // As there is only one method, there is no need to give its name; it overrides the method.
        // There is no need for 'return' if there is a single line, and no need to mention data types for parameters.
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> {
            int s = a - b;
            return s;
        };

        // If there is a single parameter, there is no need for ()
        Log sys = data -> System.out.println(data);
        sys.output(add.op(10, 20));
    }
}
