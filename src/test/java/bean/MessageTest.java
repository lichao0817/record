package bean;

import bean.Message;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Chao on 2017/3/28.
 */
public class MessageTest {
    @Test
    public void messageTest() {
        Message message = new Message();
        message.setMsg("Hello");
        Assert.assertTrue(message.getMsg().equals("Hello"));
    }
}
