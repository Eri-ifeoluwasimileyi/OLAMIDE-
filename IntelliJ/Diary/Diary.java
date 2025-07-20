package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;
    private int entryIdCounter = 1;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        }
    }

    public void lockDiary() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body) {
        if (!isLocked) {
            entries.add(new Entry(entryIdCounter++, title, body));
        }
    }

    public void deleteEntry(int id) {
        if (!isLocked) {
            Entry entry = findEntryById(id);
            entries.remove(entry);
        }
    }

    public Entry findEntryById(int id) {
        for (Entry entry : entries) {
            if (entry.getId() == id) return entry;
        }
        throw new IllegalArgumentException("Entry with id " + id + " not found");
    }

    public void updateEntry(int id, String title, String body) {
        if (!isLocked) {
            Entry entry = findEntryById(id);
            entry.setTitle(title);
            entry.setBody(body);
        }
    }

    public String getUsername() {
        return username;
    }
}