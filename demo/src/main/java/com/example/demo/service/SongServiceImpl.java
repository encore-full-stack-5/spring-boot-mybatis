package com.example.demo.service;

import com.example.demo.domain.Song;
import com.example.demo.dto.request.SongRequest;
import com.example.demo.exception.NotFoundException;
import com.example.demo.mapper.SongMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService {
    private final SongMapper songMapper;
    @Override
    public void save(SongRequest req){
        songMapper.insertSong(req.toEntity());
    }

    @Override
    public List<Song> findAllSongs() {
        return songMapper.findAllSong();
    }

    @Override
    public Song updateSong(Long id, SongRequest req) {
        // 1. db있는거 부터 찾아와야지 id로
        Song songById = findSongById(id);
        if(songById == null) throw new NotFoundException("SONG");
//        songById 존재한다
        if(
                songById.getLyrics().equals(req.getLyrics())
                        &&
                songById.getTitle().equals(req.getTitle())
        ) return songById;
        Song entity = req.toEntity(id);
        songMapper.updateSong(entity);
        return entity;
    }

    @Override
    public void deleteSong(Long id) {
        songMapper.deleteSong(id);
    }

    @Override
    public Song findSongById(Long id) {
        return songMapper.findSongById(id);
    }
}
