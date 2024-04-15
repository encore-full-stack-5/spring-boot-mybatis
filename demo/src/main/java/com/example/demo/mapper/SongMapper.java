package com.example.demo.mapper;

import com.example.demo.domain.Song;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SongMapper {
    int insertSong(Song song);
    int updateSong(Song song);
    int deleteSong(@Param("id") long id);
    Song findSongById(@Param("id") long id);
    List<Song> findAllSong();
    List<Song> findSongByQuery(@Param("query") String query);
}
