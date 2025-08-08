import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Entry> entries = new ArrayList<>();

        System.out.println("Welcome to MindDump!");
        System.out.println("What do you wanna do today? ");

        while(true){
            System.out.println("[1] Write Entry");
            System.out.println("[2] View All");
            System.out.println("[3] Exit");
            System.out.print("> ");

            int input = scanner.nextInt();
            String _ = scanner.nextLine();

            switch(input){
                case 1 -> {
                    System.out.print("Write entry here: ");
                    String entry = scanner.nextLine();
                    System.out.println("Entry saved successfully!");
                    System.out.print("Tags? (comma-separated):> ");
                    String tags = scanner.nextLine();
                    System.out.println("Successfully attached tags!");
                    entries.add(new Entry(entry, tags));
                }
                case 2 -> {
                    System.out.println("View all entries: ");
                    if (entries.isEmpty()){
                        System.out.println("There is no records...");
                    } else {
                        for (Entry e : entries){
                            System.out.println(e);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Goodbye, have a good day!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}