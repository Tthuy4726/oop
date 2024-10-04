public class Exercise_4 {

    public void printEvenNumbers() {
        int number = 1;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }

    public static void main(String[] args) {
        Exercise_4 printer = new Exercise_4();
        printer.printEvenNumbers();
    }
}
