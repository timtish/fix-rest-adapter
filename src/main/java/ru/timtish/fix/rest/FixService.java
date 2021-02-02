package ru.timtish.fix.rest;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;
import quickfix.Message;

@Component
public class FixService {

    public void msg1(Exchange ex) {
        Message req = new Message();
        req.setString(1, "test");
        ex.getMessage().setBody(req);
    }

}
