package com.example.E_Learning_Platform.controller;

import com.example.E_Learning_Platform.Services.EmailSenderService;
import com.example.E_Learning_Platform.resource.EmailMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private  final EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @PostMapping("/send-mail")
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage){
        this.emailSenderService.sendEmail(emailMessage.getTo(),
                emailMessage.getSubject(),
                emailMessage.getMessage());
        return ResponseEntity.ok("Success");
    }
}
