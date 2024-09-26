interface One {
    void o();
    void m();
}

interface Two {
    void n();
}

class Abc implements One, Two {
    public void o() {
        System.out.println("I'm O");
    }

    public void m() {
        System.out.println("I'm M");
    }

    public void n() {
        System.out.println("I'm N");
    }
}

 class Interface {
    public static void main(String[] args) {
        Abc obj = new Abc();
        obj.o();
        obj.m();
        obj.n();
    }
}
