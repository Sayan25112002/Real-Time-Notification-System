package com.RealTime.NotificationSystem.mapper;

import com.RealTime.NotificationSystem.dto.requestDto.NotificationRequestDto;
import com.RealTime.NotificationSystem.dto.responseDto.NotificationResponseDto;
import com.RealTime.NotificationSystem.entity.Notification;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    Notification toNotification(NotificationRequestDto notificationRequestDto);

    NotificationResponseDto toNotificationResponseDto(Notification notification);

    List<NotificationResponseDto> toNotificationResponseDto(List<Notification> notifications);

}
