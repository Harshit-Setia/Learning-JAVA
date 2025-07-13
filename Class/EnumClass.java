enum Status{
    Running, Faild, Pending, Succes;
}

enum Laptop{
    MacBook(2000),ThinkPad;
    private int price;

    private Laptop() {// called by ThinkPad
        price=500;
    }

    private Laptop(int price) {// ca;;ed by MacBook
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}

public class EnumClass {
    public static void main(String[] args) {
        Status s1=Status.Running;
        System.out.println(s1);

        // Status ss[]=Status.values();
        // for(Status s:ss){
        //     System.out.println(s+" : "+s.ordinal());
        // }

        if(s1==Status.Faild){
            System.out.println("Error");
        }else{
            System.out.println("Ok");
        }

        switch (s1) {
            case Running:
                System.out.println("runnig");
                break;
            case Pending:
                System.out.println("Wait");
                break;
            case Succes:
                System.out.println("Done");
                break;
        
            default:
            System.out.println("Error");
                break;
        }

        for(Laptop lap:Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }

    }
}
