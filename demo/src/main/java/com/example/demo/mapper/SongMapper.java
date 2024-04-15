package com.example.demo.mapper;

import com.example.demo.domain.Song;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SongMapper {
    int insertSong(Song song);
}
