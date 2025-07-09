class Outer {
    // Non-static InnerClass
    class Inner {
        void show() {
            System.out.println("Inner");
        }
    }

    // Static InnerClass
    static class StaticInner {
        void show() {
            System.out.println("StaticInner");
        }
    }

    // Method of OuterClass
    void show() {
        System.out.println("Outer");
    }
}

public class InnerClass {
    public static void main(String[] args) {

        Outer obj1 = new Outer();

        
        Outer.Inner obj2 = obj1.new Inner();
        obj2.show();

        
        Outer.StaticInner obj3 = new Outer.StaticInner();
        obj3.show();

        // Creating an anonymous inner class by extending Outer
        Outer obj4 = new Outer() {
            // Overriding the show() method
            void show() {
                System.out.println("AnonymousInner");
            }
        };
        obj4.show();
    }
}
