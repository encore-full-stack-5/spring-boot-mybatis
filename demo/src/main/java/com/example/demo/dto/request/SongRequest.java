package com.example.demo.dto.request;

import lombok.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class SongRequest {
    private final String title;
    private final String lyrics;
}
