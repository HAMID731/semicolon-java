package Diary;

import java.util.ArrayList;

public class Diary  {
    public String username;
    private final String password;
    public boolean isLocked;
    private final ArrayList<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }

    public void get

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

    public boolean createEntry(String title, String content) {
        if (!isLocked) {
            Entry entry = new Entry(entries.size() + 1, title, content);
            entries.add(entry);
            return true;
        } else {
            return false;
        }
    }

    public String deleteEntry(int id) {
        entries.removeIf(entry -> entry.getId() == id);
        return "Entry deleted";
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