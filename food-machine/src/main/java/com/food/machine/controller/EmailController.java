package com.food.machine.controller;

import com.food.machine.service.EmailServiceImpl;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailServiceImpl emailService;

    @GetMapping("/send-email-with-attachment")
    public String sendEmailWithAttachment(@RequestParam String to, @RequestParam String subject, @RequestParam String text, @RequestParam String attachmentPath) throws MessagingException {
        emailService.sendEmailWithAttachment(to, subject, text, attachmentPath);
        return "Email with attachment sent successfully to " + to;
    }
}
