package com.RealTime.NotificationSystem.service.implementation;

import com.RealTime.NotificationSystem.dto.requestDto.NotificationRequestDto;
import com.RealTime.NotificationSystem.dto.responseDto.NotificationResponseDto;
import com.RealTime.NotificationSystem.entity.Notification;
import com.RealTime.NotificationSystem.mapper.NotificationMapper;
import com.RealTime.NotificationSystem.repository.NotificationRepository;
import com.RealTime.NotificationSystem.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;
    private final NotificationMapper notificationMapper;

    @Override
    public String sendNotification(NotificationRequestDto notificationRequestDto) {
        Notification notification = notificationMapper.toNotification(notificationRequestDto);
        notificationRepository.save(notification);
        NotificationResponseDto notificationResponseDto = notificationMapper.toNotificationResponseDto(notification);
        return notificationResponseDto.getMessage();
    }
}
