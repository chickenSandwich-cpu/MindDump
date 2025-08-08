import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Entry> entries = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to MindDump!");
        System.out.println("What do you wanna do today? ");

        while (true) {
            System.out.println("[1] Write Entry");
            System.out.println("[2] View All");
            System.out.println("[3] Search Entry By Tags");
            System.out.println("[4] Exit");
            System.out.print("> ");

            int input = scanner.nextInt();
            String _ = scanner.nextLine();

            switch (input) {
                case 1 -> saveEntry();
                case 2 -> viewEntries();
                case 3 -> searchEntry();
                case 4 -> {
                    System.out.println("Goodbye, have a good day!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static void saveEntry() {
        System.out.print("Write entry here: ");
        String entry = scanner.nextLine();
        System.out.println("Entry saved successfully!");
        System.out.print("Tags? (comma-separated):> ");
        String tags = scanner.nextLine();
        System.out.println("Successfully attached tags!");
        entries.add(new Entry(entry, tags));
    }

    public static void viewEntries(){
        System.out.println("View all entries: ");
        if (entries.isEmpty()) {
            System.out.println("There is no records...");
        } else {
            for (Entry e : entries) {
                System.out.println(e);
            }
        }
    }

    public static void searchEntry(){
        System.out.println("debug");
    }
}