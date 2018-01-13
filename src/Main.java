public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! I have no clue what I'm doing.");
        printer(arrayTest());

    }

    public static int[] arrayTest(){
        int[] array = new int[6];
        for (int x = 0; x < array.length; x++ ) {
            array[x] = x;
        }
        return array;

    }

   public static void printer(int[] array) {
       for (int x : array) {
           System.out.println(x);
       }
   }
}
