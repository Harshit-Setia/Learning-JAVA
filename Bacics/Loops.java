public class Loops {
    public static void main(String[] args) {
        
        //while
        int num=1;
        while(num<=10){
            System.out.println(num++);//1 to 10
        }

        //do while
        do{
            System.out.println(num);
            num++;
        }while(num<10);

        //for
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        //enhanced for
        int arr[]={1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
