package com.wyb.message.config.sms.impl;

import com.wyb.message.config.sms.SmsConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Marcher丶
 */
@Data
@ConfigurationProperties(prefix = "aliyun.sms")
public class AliSmsConfig implements SmsConfig {

    private String appId;

    private String appKey;

    private String url;

    @Override
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
