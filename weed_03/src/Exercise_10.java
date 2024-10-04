public class Exercise_10 {
    public void calculateSum() {
        int sum = 0;
        for (int number = 1; number <= 100; number++) {

            if (number % 7 == 0) {
                sum += number;
            }
        }

        System.out.println("Tổng các số từ 1 đến 100 chia hết cho 7 là: " + sum);
    }

    public static void main(String[] args) {
        Exercise_10 exercise = new Exercise_10();
        exercise.calculateSum();
    }
}