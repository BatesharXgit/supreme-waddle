public class Arrays {
     public static void main(String[] args){
         String[] cars =  {"Lamborghini", "BMW", "Mercedes", "Porsche"};  //way one
//         String[] cars =  new String[4];  //way two
//         cars[0] = "Lamborghini";
//         cars[1] = "BMW";
//         cars[2] = "Mercedes";
//         cars[3] = "Porsche";
         for(int i = 0; i < 2; i++){ //for loop
             System.out.println(cars[i]);
         }

         for(String car : cars){ //for each loop
             System.out.println(car);
         }
    }
}
