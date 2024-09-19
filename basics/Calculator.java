//import java.util.*;
//public class Calculator {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        public static void addition(int a, int b) {
//            int sum = a + b;
//            System.out.println(sum);
//        }
//
//        addition(x,y);
//    }
//}


import java.util.*;
public class Calculator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter a valid input between 1 to 4: ");
        int caseInput = sc.nextInt();

        switch (caseInput){
            case 1:
                addition(x, y);
                break;
            case 2:
                substraction(x, y);
                break;
            case 3:
                muliplication(x, y);
                break;
            case 4:
                division(x, y);
                break;
            default:
                System.out.println("Please Enter a valid input");
                break;
        }
    }

    public static void addition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void muliplication(int a, int b){
        int multiply = a * b;
        System.out.println(multiply);
    }

    public static void substraction(int a, int b){
        int substract = a - b;
        System.out.println(substract);
    }

    public static void division(int a, int b){
        int divide = a / b;
        System.out.println(divide);
    }
}