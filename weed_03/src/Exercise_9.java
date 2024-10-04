public class Exercise_9 {
    public void findBiggestDivisibleBy7() {
        int biggest = 0;
        for (int number = 1; number <= 100; number++) {
            if (number % 7 == 0) {
                biggest = number;
            }
        }

        System.out.println("The biggest number between 1 and 100 that is divisible by 7 is: " + biggest);
    }
    public static void main(String[] args) {
        Exercise_9 calculator = new Exercise_9();
        calculator.findBiggestDivisibleBy7();
    }

}
