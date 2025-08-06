import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MindDump!");
        System.out.println("What do you wanna do today? ");

        while (true){
            System.out.println("[1] Write Entry");
            System.out.println("[2] View Entries");
            System.out.println("[3] View All");
            System.out.println("[4] Exit");
            System.out.print("> ");

            int input = scanner.nextInt();
            String s = scanner.nextLine();

            switch (input){
                case 1 -> {
                    System.out.println("Write entry here: ");
                }
                case 2 -> {
                    System.out.println("View entries here: ");
                }
                case 3 -> {
                    System.out.println("View all entries: ");
                }
                case 4 -> {
                    System.out.println("Goodbye, have a good day!");
                    break;
                }
            }
        }

    }
}