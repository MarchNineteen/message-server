package com.wyb.message.api;

import com.wyb.message.api.mail.MailService;
import com.wyb.message.api.sms.SmsService;

/**
 * @author Marcher丶
 */
public interface AllService {

    MailService mailService();

    SmsService smsService();
}
