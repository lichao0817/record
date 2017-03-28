package bean;

import java.io.Serializable;

/**
 * Created by Chao on 2017/3/28.
 */
public class Message implements Serializable{
    private String msg;
    public Message() {}

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
