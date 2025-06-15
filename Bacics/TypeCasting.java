public class TypeCasting{
    public static void main(String[] args) {
        //implicit 
        // no data loss
        {
        int a=10;
        double b=a;
        long c=a;

        float d=10f;
        double e=d;
        }

        //explicit 
        // data may loss
        {
        double a=10;
        float b=(float)a;
        int c=(int)a;
        
        // Error
        /*
        float b=a; 
        int c=a;
        */
        }
    }
}