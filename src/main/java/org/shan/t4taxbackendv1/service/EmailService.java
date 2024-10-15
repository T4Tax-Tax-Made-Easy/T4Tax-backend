package org.shan.t4taxbackendv1.service;

import org.shan.t4taxbackendv1.entity.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService{
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(EmailRequest emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("shanpradeep3700@gmail.com");
        message.setTo("shanpradeep2023@gmail.com"); // Your email address
        message.setSubject(emailRequest.getSubject());

        // Construct the email body
        String emailBody = String.format("%s\n\n--\n\nName: %s\nPhone: %s",
                emailRequest.getBody(),
                emailRequest.getName(),
                emailRequest.getPhone());
        message.setText(emailBody);

        // Set reply-to address
        message.setReplyTo(emailRequest.getPersonalEmail());

        mailSender.send(message);
    }
}
