public class Conditional {
    public static void main(String[] args) {
        //if else
        int x=-12;
        if(x<0){
            System.out.println("small");
        }
        else if(x>0){
            System.out.println("big");
        }
        else{
            System.out.println("zero");
        }

        //ternary
        String ans=x>=0?"positive":"negative";

        //switch case
        switch (ans) {
            case "positive":
                System.out.println(x);
                break;
            case "negative":
                System.out.println(-x);
                break;
            default:
                break;
        }
    }
}
