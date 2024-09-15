import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum sumObject = new Sum();
        Average averageObject = new Average();

        // Print statements to prompt user input action
        System.out.println("Choose option:");
        System.out.println("1. Average");
        System.out.println("2. Sum");
        System.out.println("Pick 1 or 2:");
        int choice = sc.nextInt();

        // Print statements to prompt user input of number selection
        System.out.print("What is your 1st number? ");
        int number1 = sc.nextInt();
        System.out.print("What is your 2nd number? ");
        int number2 = sc.nextInt();

        // calls either method
        switch (choice) {
            case 1:
                double average = averageObject.calculateAverage(number1, number2);
                System.out.println("Average: " + average);
                break;

            case 2:
                int sum = sumObject.calculateSum(number1, number2);
                System.out.println("Sum: " + sum);
                break;

            default:
                System.out.println("Not an option.");
        }
    }
}

// main pulls calculate sum and average classes to manipulate user input
