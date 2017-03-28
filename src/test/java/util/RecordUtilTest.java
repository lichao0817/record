package util;

import model.Gender;
import model.Record;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * Created by Chao on 2017/3/23.
 */
public class RecordUtilTest {
    @Test
    public void parseRecordTest1() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("comma-delimited.txt").getFile());
        List<Record> list = RecordUtil.getRecordsByBirthday(file);
        for (int i = 1; i < list.size(); i++) {
            Assert.assertTrue(list.get(i - 1).getDateOfBirth().compareTo(list.get(i).getDateOfBirth()) < 0);
        }
    }
    @Test
    public void parseRecordTest2() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("pipe-delimited.txt").getFile());
        List<Record> list = RecordUtil.getRecordsByGender(file);
        for (int i = 1; i < list.size(); i++) {
            Assert.assertTrue(list.get(i - 1).getGender() == Gender.Female ||
                    (list.get(i - 1).getGender() == Gender.Male && list.get(i).getGender() == Gender.Male));
        }
    }
    @Test
    public void parseRecordTest3() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("space-delimited.txt").getFile());
        List<Record> list = RecordUtil.getRecordsByName(file);
        for (int i = 1; i < list.size(); i++) {
            Assert.assertTrue(list.get(i - 1).getLastName().compareTo(list.get(i).getLastName()) >= 0);
        }
    }
}
