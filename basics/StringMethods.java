import java.util.*;
public class StringMethods {
    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);
//        String name = prompt.next();
        String name = "Yogesh Bateshar";
//        int result = name.length();
//        boolean result = name.equalsIgnoreCase("Yogesh bateshar");
//        char result = name.charAt(2);
//        int result = name.indexOf("B");
//        String result = name.trim();
        String result = name.replace("Yogesh", "Yogi");
        System.out.println(result);
    }
}
