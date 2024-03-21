import java.util.ArrayList;
public class ArraysList {
    public static void main(String[] args){
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Sandwich");

        for(String food : foods){
            System.out.println(food);
        }
        foods.clear();
        for(String food1 : foods){
            System.out.println(food1);
        }
    }
}
