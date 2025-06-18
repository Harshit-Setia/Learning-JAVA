//Class:-Bluprint
class Calculator{
    //variables
    public int num1;
    public int num2;
    //constructor
    public Calculator(){}//default constructor

    public Calculator(int num1,int num2){
        //this refrence varible of current instance of class
        this.num1=num1;
        this.num2=num2;
    }
    //method
    public int add(){
        return num1+num2;
    }
    public int sub(){
        return num1-num2;
    }
}


public class ClassObj {
    public static void main(String[] args) {
        //Creating Object
        Calculator calc=new Calculator(2,3);//calls constructor
        System.out.println(calc.add());
        System.out.println(calc.sub()/*calling methods of class*/);
    }
}
