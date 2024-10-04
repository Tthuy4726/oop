public class Exercise_6 {
    public void printEvenNumbers() {
        for (int number = 1; number <= 100; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        Exercise_6 printer = new Exercise_6();
        printer.printEvenNumbers();
    }
}