public class ForLoops {
       public static int addEvens(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
      public static void printSquaresBack(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i * i + " ");
        }
        System.out.println();
    }
      public static void sillyNumbers(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
        public static void sillyNumbers2(){
        for (int i = 0; i < 4; i++) {
            for (int j = 9; j >= 1; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
        public void dollarsAndStars(){
            for(int i = 0; i<7; i++){
                for(int j = (2*i); j>0; j--){
                    System.out.print("*");
                }
                for(int k = (7-i); k>0; k--){
                    System.out.print("$");
                }
                for(int n = (2*(7-i)); n>0; n--){
                    System.out.print("*");
                }
                for(int s = (7-i); s>0; s--){
                    System.out.print("$");
                }
                for(int b = (2*i); b>0; b--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        ForLoops fl = new ForLoops();
        System.out.println("addEvens");
        System.out.println(addEvens(10));
        System.out.println(addEvens(5));
        System.out.println(addEvens(20));
        System.out.println("\n");
        System.out.println("************");
        System.out.println("\n");
        System.out.println("printSquaresBack");
        printSquaresBack(10);
        printSquaresBack(8);
        printSquaresBack(5);
        System.out.println("\n");
        System.out.println("************");
        System.out.println("\n");
        System.out.println("sillynumbers");
        sillyNumbers();
        System.out.println("\n");
        System.out.println("**************");
        System.out.println("\n");
        System.out.println("sillynumbers2");
        sillyNumbers2();
        System.out.println("\n");
        System.out.println("**************");
        System.out.println("\n");
        System.out.println("dollarsAndStars");
        fl.dollarsAndStars();
    }

}

