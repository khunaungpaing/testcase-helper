package com.khun.testcasehelper.service;

import jakarta.mail.MessagingException;
import org.springframework.stereotype.Service;

@Service
public interface EmailSenderService {

    void sendSimpleMessage(String toEmail, String subject, String text);
    void sendMessageWithAttachment(String toEmail, String subject, String text, String pathToAttachment) throws MessagingException;

}
