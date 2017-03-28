package app;

import dao.RecordDao;
import model.Record;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.RecordUtil;

import java.util.List;

/**
 * Created by Chao on 2017/3/28.
 */
@RestController
public class RestAPIController {
    private RecordDao dao = new RecordDao();
    private List<Record> records = dao.getAllRecords();
    @RequestMapping("/records/name")
    public List<Record> getRecordsByName(){
        RecordUtil.sortRecordsByName(records);
        return records;
    }
    @RequestMapping("/records/gender")
    public List<Record> getRecordsByGender() {
        RecordUtil.sortRecordsByGender(records);
        return records;
    }
    @RequestMapping("/records/birthdate")
    public List<Record> getRecordsByBirthdate() {
        RecordUtil.sortRecordsByBirthDay(records);
        return records;
    }
}
