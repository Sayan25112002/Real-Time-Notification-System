package com.RealTime.NotificationSystem.dto.responseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageResponseDto {

    private Long id;

    private String message;

    private LocalDateTime messageSendAt;

}
