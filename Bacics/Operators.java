public class Operators {
    public static void main(String[] args) {
        //arithmetic
        // +,-,/,*,%
        {
        int a=10;
        int b=20;
        int c=a+b;
        int d=a%b;
        }

        //comparison
        // ==,!=,>,<,>=,<=
        {
        int a=10;
        int b=20;
        boolean c=a==b;
        boolean d=a<=b;
        }

        //logical
        // &&,||,!
        {
        int a=10;
        int b=20;
        boolean c=a<b||b==a;
        boolean d=a<b&&b!=a;
        }

        //assignment
        // =,+=,-=,*=,/=,%=
        {
        int a=10;
        a+=1;
        a-=2;
        a*=30;
        a/=10;
        a%=2;
        }

        //unary
        // +,-,++,--
        {
        int a=10;
        a=+a;
        a=-a;
        a++;
        a--;
        }

        //bitwise
        // &,|,~,<<,>>,>>>
        {
        int a=1;
        a = a>>2;
        a = a&2;
        }

        //ternary
        {
        int a=10;
        a= a<20?20:a;
        }
    }
}
