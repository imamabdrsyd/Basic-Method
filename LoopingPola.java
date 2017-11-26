public class LoopingPola {

            public static void main(String[ ] args) {
                Scanner show = new Scanner(System.in);
                System.out.println("Input Staircase: ");
                int inputan = show.nextInt();
                
            for (int i = 1; i <= inputan; i++) {
                for (int j = i; j <= inputan; j++) {
                    System.out.print("#");
                }
                System.out.println();
        }
    }
}