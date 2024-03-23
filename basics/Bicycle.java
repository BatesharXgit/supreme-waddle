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

        System.out.println("The details of the bicycle1");
        bicycle1.changeGear(2);
        bicycle1.speedUp(20);
        bicycle1.showDetails();

        System.out.println("The details of the bicycle2");
        bicycle2.changeGear(4);
        bicycle2.speedUp(40);
        bicycle2.showDetails();
    }
}