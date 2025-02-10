package Diary;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getUserMenu(scanner);
    }

    public static void getUserMenu(Scanner scanner) {
        System.out.println("""
                WELCOME TO HAMID'S DIARY APP
                1. Register.
                2. Login.
                please enter your choice >>>>>>>>>>>
                """);
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                registerUser(scanner);
                break;
            case 2:
                loginUser(scanner);
                break;
            default:
                System.out.println("Invalid choice!");
                getUserMenu(scanner);
        }
    }

    public static void registerUser(Scanner scanner) {
        System.out.println("Enter username");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        Diary diary = new Diary(username, password);
        System.out.println("User registered successfully!");
        getMenu(scanner, diary);
    }

    public static void loginUser(Scanner scanner) {
        System.out.println("Enter username");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();

        Diary diary = new Diary(username, password);
        System.out.println("User logged in successfully!");
        getMenu(scanner, diary);
    }

    public static void getMenu(Scanner scanner, Diary diary) {
        System.out.println("""
                WELCOME TO HAMID'S DIARY APP
                1. Create Entry.
                2. Lock Diary.
                3. Unlock Diary.
                4. Find Entry By ID.
                5. Update Entry.
                6. Delete Entry.
                please enter your choice >>>>>>>>>>>
                """);
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                diary.createEntry(scanner);
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
                scanner.nextLine();
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
                scanner.nextLine();
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
                scanner.nextLine();
                System.out.println(diary.deleteEntry(id));
                getMenu(scanner, diary);
                break;
            default:
                System.out.println("Invalid choice!");
                getMenu(scanner, diary);
        }
    }
}
