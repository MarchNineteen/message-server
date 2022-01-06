package com.wyb.message.api.sms.impl;

import com.wyb.message.api.sms.SmsService;
import com.wyb.message.config.sms.SmsConfig;
import com.wyb.message.request.HttpRequest;

/**
 * @author Marcher丶
 */
public abstract class AbstractSmsServiceImpl implements SmsService {

    protected HttpRequest request;

    public abstract void setSmsConfig(SmsConfig smsConfig);

}
