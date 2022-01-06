package com.wyb.message.configuration;

import com.wyb.message.api.mail.MailService;
import com.wyb.message.api.mail.impl.AliMailServiceImpl;
import com.wyb.message.api.sms.SmsService;
import com.wyb.message.api.sms.impl.AliSmsServiceImpl;
import com.wyb.message.config.mail.impl.AliMailConfig;
import com.wyb.message.config.sms.impl.AliSmsConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author Marcher 实现自动化配置(提供实体bean的验证以及初始化)
 * @EnableConfigurationProperties 启动配置类 若无此注解 配置类无法注入spring上下文 根据配置文件 生成bean
 */
@Configuration
@EnableConfigurationProperties({AliMailConfig.class, AliSmsConfig.class})
@ConditionalOnClass(MailService.class) // 存在MailService时初始化该配置类
@ConditionalOnProperty// 存在对应配置信息时初始化该配置类
        (prefix = "aliyun.mail", // 存在配置前缀
                value = "url", // 开启
                matchIfMissing = false// 缺失检查
        )
public class AliYunServiceAutoConfiguration {

    // application.properties配置文件映射前缀实体对象
    @Resource
    private AliMailConfig mailProperties;

    @Resource
    private AliSmsConfig smsProperties;

    /**
     * 根据条件判断不存在mailService时初始化新bean到SpringIoc
     *
     * @return
     */
    @Bean(name = "mailService") // 创建HelloService实体bean
    @ConditionalOnMissingBean(MailService.class) // 缺失MailService实体bean时，初始化HelloService并添加到SpringIoc
    public MailService mailService() {
        System.out.println("MailService init.");
        AliMailServiceImpl mailService = new AliMailServiceImpl(mailProperties);
        return mailService;
    }

    @Bean(name = "smsService") // 创建HelloService实体bean
    @ConditionalOnMissingBean(SmsService.class) // 缺失MailService实体bean时，初始化HelloService并添加到SpringIoc
    public SmsService smsService() {
        System.out.println("SmsService init.");
        AliSmsServiceImpl smsService = new AliSmsServiceImpl(smsProperties);
        return smsService;
    }
}
