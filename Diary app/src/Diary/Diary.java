package Diary;

import java.util.ArrayList;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private ArrayList<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }

    public String getUsername() {
        return this.username;
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

    public void createEntry(String title, String content) {
        if (!isLocked) {
            Entry entry = new Entry(entries.size() + 1, title, content);
            entries.add(entry);
            System.out.println("Entry created successfully!");
        } else {
            System.out.println("Diary is locked. Please unlock to create entries.");
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
