abstract class Abstraction {
    abstract void ab();
    void nab(){
        System.out.println("i am not abstract method");
    }
}

class MyClass extends Abstraction {
    void ab(){
        System.out.println("I'm abstract method");
    }
}

class MainClass {
    public static void main(String ar[])
    {
        MyClass ob=new MyClass();
        ob.ab();
        ob.nab();
    }
}