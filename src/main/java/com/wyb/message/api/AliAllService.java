package com.wyb.message.api;

import com.wyb.message.api.mail.MailService;
import com.wyb.message.api.mail.impl.AliMailServiceImpl;
import com.wyb.message.api.sms.SmsService;
import com.wyb.message.api.sms.impl.AliSmsServiceImpl;
import com.wyb.message.exception.NoService;

/**
 * @author Marcher丶
 */
public class AliAllService implements AllService {

    private AliSmsServiceImpl smsService;
    private AliMailServiceImpl mailService;

    private static AliAllService instance;

    public AliAllService() {
    }

    public static AliAllService getInstance() {
        if (null == instance) {
            return instance = new AliAllService();
        }
        return instance;
    }
    @Override
    public MailService mailService() {
//        throw new NoService();
        return mailService;
    }

    @Override
    public SmsService smsService() {
        return smsService;
    }

    public void setSmsService(AliSmsServiceImpl smsService) {
        this.smsService = smsService;
    }

    public void setMailService(AliMailServiceImpl mailService) {
        this.mailService = mailService;
    }


}
