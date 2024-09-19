interface Character {
    void attack();
}

interface Weapon {
    void use();
}

class Warrior implements Character, Weapon {
    public void attack() {
        System.out.println("Warrior attacks with a sword.");
    }

    public void use() {
        System.out.println("Warrior uses a sword.");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.attack(); // Output: Warrior attacks with a sword.
        warrior.use(); // Output: Warrior uses a sword.

    }
}