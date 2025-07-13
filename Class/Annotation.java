//annotations are extra info for compiler so runtime errors can be prevented
@Deprecated// tells that function will be removed
class X{
    void showDataInClass(){
        System.out.println("in X");
    }
}
class Y extends X{
    @Override //make sure method is overriden
    void showDataInClass(){
        System.out.println("in Y");
    }
}

public class Annotation {
    
}
