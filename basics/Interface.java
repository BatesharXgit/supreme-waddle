interface one{
    void o();
    void m();
}
interface two
{
    void n();
}
class abc implements one,two {
    void o(){
        System.out.println("I'm O)");
    }
    void m(){
        System.out.println("I'm M)");
    }
    void n(){
        System.out.println("I'm N)");
    }
}
public class Interface {
}
