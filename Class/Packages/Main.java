import tools.*;

// can be imported separately
/*import Packages.tools.AdvCalc;
import Packages.tools.Calc;*/

public class Main {
    public static void main(String[] args) {
        Calc obj=new Calc();
        AdvCalc obj2=new AdvCalc();
        System.out.println(obj.add(1,2));
        System.out.println(obj2.add(1, 2));
    }
}
