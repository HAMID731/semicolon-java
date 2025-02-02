package Diary;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diary diary = new Diary("HAMID", "ww321");
        getMenu(scanner, diary);
    }

    public static void getMenu(Scanner scanner, Diary diary) {
        System.out.println("WELCOME TO HAMID'S DIARY APP");
        System.out.println("1. Create Entry.");
        System.out.println("2. Lock Diary.");
        System.out.println("3. Unlock Diary.");
        System.out.println("4. Find Entry By ID.");
        System.out.println("5. Update Entry.");
        System.out.println("6. Delete Entry.");
        System.out.print("Please enter your choice >>>>>>>>>>> ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                diary.createEntry();
                getMenu(scanner, diary);
                break;
            case 2:
                diary.lockDiary();
                System.out.println("Diary locked successfully!");
                getMenu(scanner, diary);
                break;
            case 3:
                System.out.println("Enter password");
                String password = scanner.nextLine();
                if (diary.unlockDiary(password)) {
                    System.out.println("Diary unlocked successfully!");
                } else {
                    System.out.println("Incorrect password!");
                }
                getMenu(scanner, diary);
                break;
            case 4:
                System.out.println("Enter ID");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                Entry entry = diary.findEntryById(id);
                if (entry != null) {
                    System.out.println("Title: " + entry.getTitle());
                    System.out.println("Content: " + entry.getContent());
                } else {
                    System.out.println("Entry not found!");
                }
                getMenu(scanner, diary);
                break;
            case 5:
                System.out.println("Enter ID");
                id = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.println("Enter new title");
                String newTitle = scanner.nextLine();
                System.out.println("Enter new content");
                String newContent = scanner.nextLine();
                diary.updateEntry(id, newTitle, newContent);
                System.out.println("Entry updated successfully!");
                getMenu(scanner, diary);
                break;
            case 6:
                System.out.println("Enter ID");
                id = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.println(diary.deleteEntry(id));
                getMenu(scanner, diary);
                break;
            default:
                System.out.println("Invalid choice!");
                getMenu(scanner, diary);
        }
    }
}
