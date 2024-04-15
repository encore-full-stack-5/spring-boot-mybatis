package com.example.demo.controller;

import com.example.demo.dto.request.SongRequest;
import com.example.demo.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/songs")
public class SongController {

    private final SongService songService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSong(@RequestBody SongRequest req){
        songService.save(req);
    }
}
