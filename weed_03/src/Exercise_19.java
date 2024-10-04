public class Exercise_19 {
    public static void main(String[] args) {
        System.out.print(1 + ", ");
        for(int i = 3, j = 6; j<=1000; j*=3) {
            i = i+j;
            System.out.print(i + ", ");
        }
    }
}
