public class Exercise_5 {
    public void printEvenNumbers() {
        int number = 1;
        do {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 100);
    }
    public static void main(String[] args){
        Exercise_5 printer = new Exercise_5();
        printer.printEvenNumbers();
    }
}
