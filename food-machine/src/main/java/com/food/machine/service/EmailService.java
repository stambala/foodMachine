package com.food.machine.service;

import jakarta.mail.MessagingException;

public interface EmailService {
    void sendEmailWithAttachment(String to, String subject, String text, String attachmentPath) throws MessagingException;
}
