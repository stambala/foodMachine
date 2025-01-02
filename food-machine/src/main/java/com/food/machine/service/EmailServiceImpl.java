package com.food.machine.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@SuppressWarnings("All")
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmailWithAttachment(String to, String subject, String text) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.setText("your OTP is: " + generateOTP());
        helper.setFrom("nagapavanb955@gmail.com");
        helper.addAttachment("jsondata", attacheFile("D:/Akhil/file.json"));
        mailSender.send(message);
    }

    private String generateOTP() {
        String otp = RandomStringUtils.randomNumeric(6);
        return otp;
    }

    private File attacheFile(String attachmentPath) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        File file = new File(attachmentPath);
        if (file.exists()) {
            helper.addAttachment(file.getName(), file);
        } else {
            throw new RuntimeException("Attachment file not found: " + attachmentPath);
        }
        return file;
    }

}
