//public class Area {
//        Area(double side){
//            double square = side * side;
//            System.out.println("Area: " + square);
//        }
//        Area(double length, double bredth){
//            double rect = length * bredth;
//            System.out.println("Area: " + rect);
//        }
//        public static void main(String[] args){
//            Area ab = new Area(10);
//            Area bc = new Area(10, 20);
//
//        }
//    }
//

public class Area {
    double square;
    double rect;

    Area(double side) {
        square = side * side;
    }
    Area(double length, double breadth) {
        rect = length * breadth;
    }

    void displaySquare() {
        System.out.println("Area of square: " + square);
    }

    void displayRect() {
        System.out.println("Area of rectangle: " + rect);
    }

    public static void main(String[] args) {
        Area ab = new Area(10);
        Area bc = new Area(10, 20);

        ab.displaySquare();
        bc.displayRect();
    }
}
