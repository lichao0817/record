package app;

import dao.RecordDao;
import bean.Message;
import model.Record;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import util.RecordUtil;

import java.util.List;

@Controller
public class ServieController {
    private RecordDao dao = new RecordDao();
    private List<Record> records = dao.getAllRecords();
    @GetMapping("/records")
    public String getIndex(Model model) {
        model.addAttribute("message", new Message());
        return "index";
    }
    @PostMapping("/records")
    public String greetingSubmit(@ModelAttribute Message message) {
        dao.putRecord(RecordUtil.parseLine(message.getMsg()));
        return "index";
    }
}