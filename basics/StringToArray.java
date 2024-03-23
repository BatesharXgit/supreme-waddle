import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args){
        StringBuilder name = new StringBuilder("Yogesh");

        String[] name1 = new String[6];

        for (int i = 0; i<name.length(); i++){
            name1[i] = String.valueOf(name.charAt(i));
        }

        System.out.println(Arrays.toString(name1));
    }
}
