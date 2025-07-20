package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {

    private List<Diary> diaries = new ArrayList<>();


    public void add(String username, String password) {
        this.diaries.add(new Diary(username, password));
    }

    public Diary findByUsername(String username) {
        if (diaries.isEmpty()) {
            throw new IllegalArgumentException("No diaries found");
        }
        return findMyDiary(username);
    }

    public void delete(String username, String password) {
        if (diaries.isEmpty()) {
            throw new IllegalArgumentException("No diaries found");
        }
        diaries.remove(findMyDiary(username));
    }

    private Diary findMyDiary(String username){
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        throw new IllegalArgumentException("No diaries found");
    }

}