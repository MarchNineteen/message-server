package com.wyb.message.api.mail.impl;

import com.wyb.message.api.AliAllService;
import com.wyb.message.api.ServiceProvider;
import com.wyb.message.config.mail.impl.AliMailConfig;
import com.wyb.message.enums.PlatSource;

/**
 * @author Marcher丶
 */
public class AliMailServiceImpl extends AbstractMailServiceImpl {

    private AliMailConfig aliMailConfig;

    public AliMailServiceImpl() {
    }

    public AliMailServiceImpl(AliMailConfig aliMailConfig) {
        this.aliMailConfig = aliMailConfig;
        AliAllService.getInstance().setMailService(this);
        ServiceProvider.allServiceMap.put(PlatSource.Ali, AliAllService.getInstance());
    }

    @Override
    public String send() {
        return aliMailConfig.toString();
    }
}
