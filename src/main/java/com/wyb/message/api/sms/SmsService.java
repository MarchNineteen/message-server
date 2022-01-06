package com.wyb.message.api.sms;

import com.wyb.message.api.ApiService;

/**
 * @author Marcher丶
 */
public interface SmsService extends ApiService {

    void setTemplate();

    String send();

}
