import java.util.*;
class Factorial {
    public static void main(String[] args) {

        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find out Factorial");
        int length = sc.nextInt();
        for (int i = 1; i<= length; i++){
            fact = fact * i;
        }
        System.out.println("The factorial of the number " + length + " is: " + fact);
    }
}