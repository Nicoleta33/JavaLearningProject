package md.tekwillacademy.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        // sum of the odd numbers from 1 to 10
        int totalSum = 0;
        for(int iterator = 0; iterator <= 10; iterator++ ){
            if (iterator % 2 ==1) {
                totalSum = totalSum + iterator;
                System.out.println("Total sum: " + totalSum);
            }

        }
        System.out.println("Total sum: " + totalSum);
    }
}
