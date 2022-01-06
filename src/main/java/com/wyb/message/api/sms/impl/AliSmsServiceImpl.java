package com.wyb.message.api.sms.impl;

import com.wyb.message.api.AliAllService;
import com.wyb.message.api.ServiceProvider;
import com.wyb.message.config.sms.SmsConfig;
import com.wyb.message.config.sms.impl.AliSmsConfig;
import com.wyb.message.enums.PlatSource;

/**
 * @author Marcher丶
 */
public class AliSmsServiceImpl extends AbstractSmsServiceImpl {

    private AliSmsConfig aliSmsConfig;

    public AliSmsServiceImpl() {
    }

    public AliSmsServiceImpl(AliSmsConfig aliSmsConfig) {
        this.aliSmsConfig = aliSmsConfig;
        AliAllService.getInstance().setSmsService(this);
        ServiceProvider.allServiceMap.put(PlatSource.Ali, AliAllService.getInstance());
    }

    @Override
    public void setTemplate() {

    }

    @Override
    public String send() {
        String result;
        if (aliSmsConfig.getAppKey().isEmpty()) {
            result = "发送成功";
        }
        else {
            result = "发送失败";
        }
        return result;
    }

    @Override
    public void setSmsConfig(SmsConfig smsConfig) {
        aliSmsConfig = (AliSmsConfig) smsConfig;
    }

}
