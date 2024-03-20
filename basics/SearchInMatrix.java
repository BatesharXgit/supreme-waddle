import java.util.*;

public class SearchInMatrix {
    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);
        int number = prompt.nextInt();
        int[][] numbers = {
                {2,3,4,5,6},
                {7,8,9,10,11},
        };
        for (int i = 0; i<2; i++){
            for(int j =0; j <5; j++){
                if(numbers[i][j] == number){
                    System.out.println(i +" "+" "+ j);
                }
            }
        }
    }
}
