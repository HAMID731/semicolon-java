package diary_test;

import Diary.Diary;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiaryTest {

    @Test

    public void createToCreateEntrySuccessfully(){
        Diary diary = new Diary("HAMID","ww321");
        diary.unlockDiary("ww321");
        assertTrue(diary.createEntry("MYSELF","i love plantain and egg"));
    }

    @Test

    public void isLockedSuccessfully(){
        Diary diary = new Diary("HAMID","ww321");
        assertTrue(diary.isLocked());
    }

    @Test

    public void UnlockDiarySuccessfully(){
        Diary diary = new Diary("HAMID","ww321");
        diary.lockDiary();
        assertTrue(diary.unlockDiary("ww321"));
    }

    @Test

    public void wrongPasswordReturnsFalse(){
        Diary diary = new Diary("HAMID","ww321");
        diary.lockDiary();
        assertFalse(diary.unlockDiary("23qs2"));
    }

    @Test

    public void findEntryByIdSuccessfully(){
        Diary diary = new Diary("HAMID","ww321");
        diary.unlockDiary("ww321");
        diary.createEntry("MYSELF","i love plantain and egg");
        assertEquals("Entry deleted",diary.deleteEntry(0));

    }

    @Test

    public void deleteEntrySuccessfully(){
        Diary diary = new Diary("HAMID","ww321");
        diary.unlockDiary("ww321");
        diary.createEntry("ALL ABOUT ME","I love plantain and egg");
        diary.deleteEntry(0);
    }
}
