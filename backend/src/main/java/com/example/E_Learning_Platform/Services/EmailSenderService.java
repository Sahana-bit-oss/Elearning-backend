package com.example.E_Learning_Platform.Services;

public interface EmailSenderService {
    void sendEmail(String to, String subject, String message);
}
