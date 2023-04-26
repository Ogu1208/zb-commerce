package com.zerobase.cms.user.client.service;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.config.FeignConfig;
import com.zerobase.cms.user.service.EmailSendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FeignConfig.class)
class EmailSendServiceTest {
    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {
        // need tet code
        mailgunClient.sendEmail(null);
//        String response = emailSendService.sendEmail();
//        System.out.println(response);
    }
}