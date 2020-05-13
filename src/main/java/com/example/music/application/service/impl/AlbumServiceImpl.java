package com.example.music.application.service.impl;

import com.example.music.application.service.AlbumService;
import com.example.music.domain.model.Album;
import com.example.music.domain.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    AlbumRepository albumRepository;

    @Override
    public List<Album> findAllCd() {

        List<Album> responseList = albumRepository.findAll();

        return responseList;
    }

    @Override
    public Album findByName(String name) {

        Album album = albumRepository.findByName(name);

        return album;
    }
}
