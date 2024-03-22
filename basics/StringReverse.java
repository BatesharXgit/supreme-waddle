import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args){
        StringBuilder name = new StringBuilder("Yogesh");

        for (int i = 0; i<name.length()/2; i++){
            int back = name.length() - 1 - i;

            char frontChar = name.charAt(i);
            char lastChar = name.charAt(back);

            name.setCharAt(i, lastChar);
            name.setCharAt(back, frontChar);
        }
        System.out.println(name);
    }
}
