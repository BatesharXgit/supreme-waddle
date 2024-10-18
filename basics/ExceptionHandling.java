public class ExceptionHandling {
    public static void main(String args[]){
        int a = 1;
        try {
//            for (int i = 0; i<=5; i++){
//                a++;
//            }
            int b = 1/0;
        }
        catch ( e){
            System.out.println(e);
        }
    }
}
