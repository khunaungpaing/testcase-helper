package com.khun.testcasehelper.service.serviceImplement;

import com.khun.testcasehelper.service.EmailSenderService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@RequiredArgsConstructor
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender emailSender;

    //Send Message with no attachment

    public void sendSimpleMessage(String toEmail, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("");
        message.setTo(toEmail);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }


    // Send Message with attachment

    public void sendMessageWithAttachment(String toEmail, String subject, String text, String pathToAttachment) throws MessagingException {

        MimeMessage mimeMessage = emailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

        mimeMessageHelper.setFrom("");
        mimeMessageHelper.setText(toEmail);
        mimeMessageHelper.setSubject(subject);
        mimeMessageHelper.setText(text);

        FileSystemResource fileSystemResource = new FileSystemResource(new File(pathToAttachment));
        mimeMessageHelper.addAttachment("Invoice", fileSystemResource);

        emailSender.send(mimeMessage);
    }



}
