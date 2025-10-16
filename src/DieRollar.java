import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;
        do {
            int rollCount = 0;
            int die1, die2, die3;
            boolean Triple = false;
            System.out.printf("\nYour rolls\n");
            System.out.printf("%-8s%-10s%-10s%-10s%-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            while (!Triple) {
                rollCount++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                if (die1 == die2 && die2 == die3) {
                    Triple = true;
                }
                System.out.printf("%-8d%-10d%-10d%-10d%-10d\n", rollCount, die1, die2, die3, sum);
            }
            System.out.printf("\nYou have rolled a Triple");
            System.out.print("\nDo you want to roll again? Y or N: \n");
            String input = scanner.nextLine().trim();
            playAgain = input.equalsIgnoreCase("Y");
        } while (playAgain);
        System.out.println("Goodbye");
        scanner.close();
    }
}

