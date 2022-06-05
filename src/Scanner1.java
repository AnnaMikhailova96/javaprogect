import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Do you want to play?\n" + "Yes/No");

        String answer = sc.nextLine();
        if (answer.equals("Yes")) {
            System.out.println("Great! You need one more person to play\n" + "One player");

            String answer2 = sc.nextLine();
            if (answer2.equals("Yes")) {
                System.out.println("Unfortunately, you need at least two players to start the game");

            } else if (answer2.equals("No")) {
                System.out.println("Enter the age of the first player");

                int age = sc.nextInt();
                if (age > 12) {
                    System.out.println("Enter the age of the second player");
                } else {
                    System.out.println("The game requires an age of 12 years!");
                }
            }

            int age2 = sc.nextInt();
            if (age2 >= 12) {
                System.out.println("Welcome to the game!");

            } else {
                System.out.println("The game requires an age of 12 years!");
            }


        } else if (answer.equals("No")) {
            System.out.println("See you son!");
        }
    }
}


