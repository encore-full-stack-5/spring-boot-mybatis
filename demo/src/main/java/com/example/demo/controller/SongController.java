package com.example.demo.controller;

import com.example.demo.domain.Song;
import com.example.demo.dto.request.SongRequest;
import com.example.demo.service.SongService;
import com.example.demo.service.SongServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/songs")
public class SongController {

    private final SongService songService;
    @GetMapping
    public List<Song> getAllSongsByQuery(
            @RequestParam(
                    value = "query"
                    , required = false
                    , defaultValue = ""
            ) String query
    ){
        return songService.findSongByQuery(query);
    }



    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSong(@RequestBody SongRequest req){
        songService.save(req);
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable("id") Long id){
        return songService.findSongById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteSongById(@PathVariable("id") Long id){
        songService.deleteSong(id);
    }
    @PutMapping("/{id}")
    public void updateSongById(@PathVariable("id") Long id,
                               @RequestBody SongRequest req){
        songService.updateSong(id, req);
    }

}
