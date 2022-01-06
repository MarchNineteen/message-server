//package com.wyb.message.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.wyb.message.api.mail.MailService;
//import com.wyb.message.api.mail.impl.AliMailServiceImpl;
//import com.wyb.message.config.mail.impl.AliMailConfig;
//
///**
// * @author Marcher丶
// */
//@Configuration
//public class AppConfig {
//
//    @Bean
//    public AliMailConfig zaliMailConfig(AliYunMailConfig aliYunMailConfig) {
//        AliMailConfig config = new AliMailConfig();
//        config.setSendMailUrl(aliYunMailConfig.getUrl());
//        config.setAppId(aliYunMailConfig.getAppId());
//        config.setAppKey(aliYunMailConfig.getAppKey());
//        return config;
//    }
//
//    @Bean
//    public MailService aliMailService(AliMailConfig aliMailConfig) {
//        MailService service = new AliMailServiceImpl(aliMailConfig);
//        return service;
//    }
//}
