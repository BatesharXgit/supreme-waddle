interface One2
{
    public void on();

}
interface Two3 extends One2
{
    public void tw();

}
class Abc4 implements Two3
{
    public void on()
    {
        System.out.println("I am on");

    }
    public void tw()
    {
        System.out.println("I am tw");
    }
}
class MLevel
{
    public static void main(String[] args)
    {
        Abc4 ob = new Abc4();
        ob.on();
        ob.tw();
    }
}
