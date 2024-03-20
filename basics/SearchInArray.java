public class SearchInArray {
    public static void main(String[] args){
        int[] numbers = {20,33,45,10,64,74,48};
        int number = 45;

        for (int i =0; i<numbers.length; i++){
            if(number == numbers[i]){
                System.out.println(i);
            }
        }
    }
}
