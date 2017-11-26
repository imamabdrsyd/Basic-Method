public class LoopingPola2 {

            public static void main(String[ ] args) {
                Scanner show = new Scanner(System.in);
                System.out.println("Input Staircase: ");
                int inputan = show.nextInt();

            for (int i = 0; i < inputan; i++) {     // Looping pola dari kecil ke besar diakhiri angka yg dimasukkan
                for (int j = 0; j <= i; j++) {
                    System.out.print("#");
                }
                System.out.println();
        }
    }
}