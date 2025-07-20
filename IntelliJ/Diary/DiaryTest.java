package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    private Diary diary;

    @BeforeEach
    public void diarySetUp() {
        diary = new Diary("Ode", "password");
    }

    @Test
    public void testThatDiaryIsLocked() {
        assertTrue(diary.isLocked());

    }

    @Test
    public void testThatDiaryCanUnlockWithCorrectPassword() {
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatDiaryCannotUnlockWithWrongPassword() {
        diary.unlockDiary("pass");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanLockAfterUnlocking() {
        diary.unlockDiary("password");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanCreateEntry() {
        diary.unlockDiary("password");
        diary.createEntry("my babe", "is a girl");
        Entry entry = diary.findEntryById(1);
        assertEquals("my babe", entry.getTitle());
        assertEquals("is a girl", entry.getBody());

    }

    @Test
    public void testThatDiaryCannotCreateEntryWhenLocked() {
        diary.createEntry("you", "is a girl");
        assertThrows(IllegalArgumentException.class, () -> diary.findEntryById(1));
    }

    @Test
    public void testThatDiaryCanUpdateEntry() {
        diary.unlockDiary("password");
        diary.createEntry("you", "is a girl");
        diary.updateEntry(1, "my babe", "is a girl");
        Entry updated = diary.findEntryById(1);
        assertEquals("my babe", updated.getTitle());
        assertEquals("is a girl", updated.getBody());

    }

    @Test
    public void testThatDiaryCanDeleteEntry() {
        diary.unlockDiary("password");
        diary.createEntry("you", "is a girl");
        diary.deleteEntry(1);
        assertThrows(IllegalArgumentException.class, () -> diary.findEntryById(1));

    }

    @Test
    public void testThatDiaryCannotUpdateEntryWhenLocked() {
        diary.unlockDiary("password");
        diary.createEntry("you", "is a girl");
        diary.lockDiary();
        diary.updateEntry(1, "new", "me");
        Entry entry = diary.findEntryById(1);
        assertEquals("you", entry.getTitle());
        assertEquals("is a girl", entry.getBody());
    }

    @Test
    public void testThatDiaryCannotDeleteEntryWhenLocked() {
        diary.unlockDiary("password");
        diary.createEntry("you", "is a girl");
        diary.lockDiary();
        diary.deleteEntry(1);
        Entry entry = diary.findEntryById(1);
        assertEquals("is a girl", entry.getBody());
    }


    @Test
    public void testThatDiaryCannotFindId() {
        diary.unlockDiary("password");
        assertThrows(IllegalArgumentException.class, () -> diary.findEntryById(1));
    }
}