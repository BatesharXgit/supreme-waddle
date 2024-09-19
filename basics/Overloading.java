class Overloading {
    int sum(int a, int b){
        int c = a + b;
        return c;
    }
    int sum(int a, int b, int c)
    {
        int d = a + b + c;
        return d;
    }
}
class Ovrd {
    public static void main(String[] args)
    {
        Overloading ob = new Overloading();

        System.out.println("Sum of two numbers: " + ob.sum( + 10,20));
        System.out.println("Sum of three numbers: " + ob.sum(10,20, 30));

    }
}
