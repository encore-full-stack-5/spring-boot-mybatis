package com.example.demo.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PlayListResponse {
    private final String username;
    private final String playlistName;
    private final Integer songCount;
}
/*
endpoint : /api/v1/playlists
method : GET
param : x
 */