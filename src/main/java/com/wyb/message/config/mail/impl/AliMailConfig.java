package com.wyb.message.config.mail.impl;

import com.wyb.message.config.mail.MailConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Marcher丶
 */
@Data
@ConfigurationProperties(prefix = "aliyun.mail")
public class AliMailConfig implements MailConfig {

    private String appId;
    private String appKey;
    private String url;

    @Override
    public String getSendMailUrl() {
        return url;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
