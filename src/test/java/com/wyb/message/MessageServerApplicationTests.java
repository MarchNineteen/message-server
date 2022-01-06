//package com.wyb.message;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//import com.wyb.message.api.mail.MailService;
//
//@SpringBootTest
//@ComponentScan
//class MessageServerApplicationTests {
//
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(MessageServerApplicationTests.class, args);
//        MailService mailService = context.getBean(MailService.class);
//        System.out.println(mailService.send());
//
//        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        // context.scan("com.wyb.message.config");
//        // context.refresh();
//        // MailService mailService = context.getBean(MailService.class);
//        // System.out.println(mailService.send());
//    }
//}
