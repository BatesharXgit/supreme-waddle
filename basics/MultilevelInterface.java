interface One1{
    void one();
}

interface Two2 extends One1{
    void two();
}

class Abc2 implements Two2{
    public void one(){
        System.out.println("One");
    }

    public void two(){
        System.out.println("Two");
    }
}
public class MultilevelInterface {
    public static void main(String[] args){
        Abc2 abc = new Abc2();
        abc.one();
        abc.two();
    }
}
