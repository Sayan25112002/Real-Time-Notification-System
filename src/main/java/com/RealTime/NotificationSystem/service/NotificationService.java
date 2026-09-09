package com.RealTime.NotificationSystem.service;

import com.RealTime.NotificationSystem.dto.requestDto.NotificationRequestDto;

public interface NotificationService {

    String sendNotification(NotificationRequestDto notificationRequestDto);

}
