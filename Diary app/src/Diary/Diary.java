package Diary;

import java.util.ArrayList;
import java.util.Scanner;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> entries;
    private Scanner scanner;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean unlockDiary(String password) {
        if (password.equals(this.password)) {
            this.isLocked = false;
            return true;
        }
        return false;
    }

    public void lockDiary() {
        this.isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean createEntry() {
        if (!isLocked) {
            System.out.println("Enter title");
            String title = scanner.nextLine();
            System.out.println("Enter content");
            String content = scanner.nextLine();
            Entry entry = new Entry(entries.size() + 1, title, content);
            entries.add(entry);
            System.out.println("Entry created successfully!");
            return true;
        } else {
            System.out.println("Diary is locked. Please unlock to create entries.");
            return false;
        }
    }

    public String deleteEntry(int id) {
        entries.removeIf(entry -> entry.getId() == id);
        return "Entry deleted successfully!";
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        return null;
    }

    public void updateEntry(int id, String title, String content) {
        Entry entry = findEntryById(id);
        if (entry != null) {
            entry.setTitle(title);
            entry.setContent(content);
        }
    }
}
