package com.wyb.message.api;

import com.wyb.message.api.mail.MailService;
import com.wyb.message.api.mail.impl.AliMailServiceImpl;
import com.wyb.message.api.sms.SmsService;
import com.wyb.message.api.sms.impl.AliSmsServiceImpl;
import com.wyb.message.config.mail.impl.AliMailConfig;
import com.wyb.message.config.sms.impl.AliSmsConfig;
import com.wyb.message.enums.PlatSource;

/**
 * @author Marcher丶
 */
public class ApiTest {

    public static void main(String[] args) {
        AliSmsConfig aliSmsConfig = new AliSmsConfig();
        aliSmsConfig.setAppKey("");
        SmsService aliSmsService = new AliSmsServiceImpl(aliSmsConfig);
//        System.out.println(aliSmsService.send());

        AliMailConfig aliMailConfig = new AliMailConfig();
        MailService aliMailService = new AliMailServiceImpl(aliMailConfig);

        AllService allService = ServiceProvider.getThirdAllService(PlatSource.Ali);
        System.out.println(allService.smsService().send());
        System.out.println(allService.mailService().send());
    }
}
