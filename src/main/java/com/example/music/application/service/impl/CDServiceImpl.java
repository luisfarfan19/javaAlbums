package com.example.music.application.service.impl;

import com.example.music.application.service.CDService;
import com.example.music.domain.model.Album;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CDServiceImpl implements CDService {

    @Override
    public List<Album> findAllCd() {
        List<Album> responseList = new ArrayList<>();

        Album album1 = new Album();
        album1.setName("Atoma");
        album1.setDescription("This is an awesome album!");
        album1.setArtist("Dark Tranquility");
        responseList.add(album1);

        Album album2 = new Album();
        album2.setName("Master of Puppets");
        album2.setDescription("This is an awesome album!");
        album2.setArtist("Metallica");
        responseList.add(album2);

        return responseList;
    }

    @Override
    public Album findByName(String name) {
        Album album = new Album();
        album.setName(name);
        album.setDescription("This is an awesome album!");
        album.setArtist("GOD");

        return album;
    }
}
