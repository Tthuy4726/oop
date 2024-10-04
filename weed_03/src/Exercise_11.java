public class Exercise_11 {

        public void printEvenOdd() {
            for (int number = 1; number <= 1000; number++) {
                if (number % 2 == 0) {
                    System.out.println(number + " Even");
                } else {
                    System.out.println(number + " Uneven");
                }
            }
        }
        public static void main(String[] args) {
                Exercise_11 printer = new Exercise_11();
                printer.printEvenOdd();

    }
}


