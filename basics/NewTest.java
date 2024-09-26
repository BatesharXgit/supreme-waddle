abstract class Abs {
    abstract void ab();

    public void nab() {
        System.out.println("I am not abstract method");
    }
}
    class  Myclass extends Abs {
        public void ab() {
            System.out.println("I am abstract method ");
        }
    }
    public class NewTest {
        public static void main(String[] args) {
            Myclass ob = new Myclass();
            ob.ab();
            ob.nab();
        }
    }

