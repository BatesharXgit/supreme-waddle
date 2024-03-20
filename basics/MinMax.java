public class MinMax {
    public static void main(String[] args){
        int[] numbers = {2,4,6,8,10};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
