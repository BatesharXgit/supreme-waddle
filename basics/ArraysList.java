import java.util.ArrayList;
public class ArraysList {
    public static void main(String[] args){
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Sandwich");

//        for(String food : foods){
//            System.out.println(food);
//        }
        foods.set(1, "Tofu");
//        foods.clear();
        for(int i = 0; i < foods.size(); i++){
            System.out.println(foods.get(i));
        }

//        for(String food1 : foods){
//            System.out.println(food1);
//        }
    }
}
