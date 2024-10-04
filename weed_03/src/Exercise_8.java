public class Exercise_8 {

    public static void main(String[] args){
        Exercise_8 printer = new Exercise_8();
        printer.calculateAverage();
    }
    public void calculateAverage() {
        int sum = 0;
        int count = 0;
        for  (int number = 1; number <= 100; number++) {
            sum += number;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("the average value of the number from 1 to 100 is: " + average);
    }

}
