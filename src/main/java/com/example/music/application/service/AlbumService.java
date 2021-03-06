package com.example.music.application.service;

import com.example.music.domain.model.Album;

import java.util.List;

public interface AlbumService {
    List<Album> findAllCd();

    Album findByName(String name);
}
