import java.util.Scanner;
class Option
{
    void sum(int a, int b)
    {
        int c=a+b;
        System.out.println("the answere is:"+c);
    }
    void sub(int a, int b)
    {
        int c=a-b;
        System.out.println("the answere is:"+c);
    }
    void mul(int a, int b)
    {
        int c=a*b;
        System.out.println("the answere is:"+c);
    }
    void div(int a, int b)
    {
        int c=a/b;
        System.out.println("the answere is:"+c);
    }
}

public class Basic{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        Option o=new Option();

        switch (x){
            case 1:
                o.sum(a,b);
                break;
            case 2:
                o.sub(a,b);
                break;
            case 3:
                o.mul(a,b);
                break;
            case 4:
                o.div(a,b);
                break;
            default:
                System.out.println("Invalid input!");
        }
    }
}