public class Strings {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";

        // only one object is created
        System.out.println("s1 memoryLocation: "+ System.identityHashCode(s1));
        System.out.println("s2 memoryLocation: "+ System.identityHashCode(s2));
        
        // new object is created and asgined to s2
        s2=s2+" World";
        System.out.println("s1 memoryLocation: "+ System.identityHashCode(s1));
        System.out.println("s2 memoryLocation: "+ System.identityHashCode(s2));
    }
}
