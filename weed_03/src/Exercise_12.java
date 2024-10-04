public class Exercise_12 {
    public static void main(String[] args) {
        int[] stars = {10, 10, 10, 10, 10};
        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
