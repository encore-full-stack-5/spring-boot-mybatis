package com.example.demo.service;

import com.example.demo.domain.Song;
import com.example.demo.dto.request.SongRequest;
import com.example.demo.mapper.SongMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SongService {
    private final SongMapper songMapper;
    public void save(SongRequest req){
        songMapper.insertSong(req.toEntity());
    }
}
