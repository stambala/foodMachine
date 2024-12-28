package com.food.machine.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmailWithAttachment(String to, String subject, String text, String attachmentPath) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
//        SimpleMailMessage message = new SimpleMailMessage();
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text);
        helper.setFrom("nagapavanb955@gmail.com");
        File file = new File(attachmentPath);
        if (file.exists()) {
            helper.addAttachment(file.getName(), file);
        } else {
            throw new RuntimeException("Attachment file not found: " + attachmentPath);
        }
        mailSender.send(message);
    }
}
