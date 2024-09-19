import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome.");
        int num = sc.nextInt();
        int temp = num;
        int rnum = 0;
        int digit = 0;

        do{
            digit = temp % 10;
            temp = temp / 10;
            rnum = rnum * 10 + digit;
        }
        while (temp>0);

        if (rnum==num){
            System.out.println("The number is palindrome.");
        }
        else {
            System.out.println("The number is not a palindrome number.");
        }
    }
}
