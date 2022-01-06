package com.wyb.message.config;

import java.util.List;

import com.wyb.message.config.mail.MailConfig;
import com.wyb.message.config.sms.SmsConfig;

/**
 * @author Marcher丶
 */
public interface AllConfig {

    List<MailConfig> getMailConfigList();

    List<SmsConfig> getSmsConfigList();
}
