public class Exercise_15 {
    public static void main(String[] args) {
        int[] stars = {1, 3, 5, 7, 5, 3, 1};
        for(int i = 0; i< stars.length; i++) {
            for (int k = 0; k < (7-stars[i]) / 2; k++) {
                System.out.print("  ");
            }
            for(int j = 0; j < stars[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
