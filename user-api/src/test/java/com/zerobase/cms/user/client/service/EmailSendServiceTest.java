package com.zerobase.cms.user.client.service;

import com.zerobase.cms.user.config.FeignConfig;
import com.zerobase.cms.user.service.EmailSendService;
import feign.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FeignConfig.class)
class EmailSendServiceTest {
    @Autowired
    private EmailSendService emailSendService;

    @Test
    public void EmailTest() {
        String response = emailSendService.sendEmail();
        System.out.println(response);
    }
}