public class Shadowing {
    int x = 10;
    public void shadowingExample() {
        int x = 20;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Shadowing xd = new Shadowing();
        xd.shadowingExample();
        System.out.println(xd.x);
    }
}
