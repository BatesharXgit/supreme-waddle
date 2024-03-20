import java.util.*;
public class Matrix {
    public static void main(String[] args){
        Scanner prompt = new Scanner(System.in);
        int rows = prompt.nextInt();
        int cols = prompt.nextInt();
        String[][] cars = new String[rows][cols];
        for(int i =0; i< rows; i++){
            for (int j = 0; j < cols; j++){
                cars[i][j] = prompt.next();
            }
        }
        for(int i =0; i< rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
