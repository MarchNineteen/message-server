package com.wyb.message;

import com.wyb.message.config.sms.impl.AliSmsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Marcher丶
 */
@SpringBootApplication
@EnableConfigurationProperties
public class MessageServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MessageServerApplication.class, args);
        AliSmsConfig config = context.getBean(AliSmsConfig.class);
        System.out.println(config);
    }


}
