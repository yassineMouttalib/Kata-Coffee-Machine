package domain.message;

import domain.*;

public class Messageimpl implements Message {
    String messageContent="";
    public Messageimpl(String text) {
        messageContent = text;
    }
    @Override
    public String getText() {
        return "M:" + messageContent;
    }

    @Override
    public void setText(String text) {
        messageContent = text;
    }
}
