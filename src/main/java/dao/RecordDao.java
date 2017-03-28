package dao;
import model.Record;
import util.RecordUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class RecordDao {
    private static List<Record> list;
    public RecordDao() {
        if (list == null) {
            ClassLoader classLoader = getClass().getClassLoader();
            InputStream in = classLoader.getResourceAsStream("init.txt");
            list = RecordUtil.getRecordsByBirthday(in);
        }
    }
    public int count() {
        return list.size();
    }
    public List<Record> getAllRecords() {
        return list;
    }
    public void putRecord(Record record) {
        if (record != null) {
            list.add(record);
        }
    }
}