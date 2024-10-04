public class Exercise_7 {
    public void calculateSum() {

        int sum = 0;
        for (int number = 1; number <= 100; number++) {
            sum += number;
        }
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }

    public static void main(String[] args) {
        Exercise_7 printer = new Exercise_7();
        printer.calculateSum();
    }
}