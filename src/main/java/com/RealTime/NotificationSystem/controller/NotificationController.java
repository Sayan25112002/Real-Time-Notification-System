package com.RealTime.NotificationSystem.controller;

import com.RealTime.NotificationSystem.dto.requestDto.NotificationRequestDto;
import com.RealTime.NotificationSystem.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessage(String message){
        NotificationRequestDto notificationRequestDto = NotificationRequestDto.builder()
                .message(message)
                .messageSendAt(LocalDateTime.now())
                .build();
        return notificationService.sendNotification(notificationRequestDto);
    }
}
