import java.util.*;
class Bicycle {
    int gear = 0;
    int speed = 0;

    void changeGear(int newValue){
        gear = newValue;
    }
    void speedUp(int increment){
        speed = speed + increment;
    }

    void slowSpeed(int decrement){
        speed = speed - decrement;
    }

    void showDetails(){
        System.out.println(" speed:" +
                speed + " gear:" + gear);
    }
}

class BicycleWork{
    public static void main(String[] args){
        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        Scanner prompt = new Scanner(System.in);

        System.out.println("Select the gear for bicycle1");
        int gear1 = prompt.nextInt();
        System.out.println("The details of the bicycle1");
        bicycle1.changeGear(gear1);
        bicycle1.speedUp(20);
        bicycle1.showDetails();

        System.out.println("Select the gear for bicycle2");
        int gear2 = prompt.nextInt();
        System.out.println("The details of the bicycle2");
        bicycle2.changeGear(gear2);
        bicycle2.speedUp(40);
        bicycle2.showDetails();
    }
}