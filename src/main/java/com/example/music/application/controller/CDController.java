package com.example.music.application.controller;

import com.example.music.application.resource.CDResource;
import com.example.music.application.service.AlbumService;
import com.example.music.domain.model.Album;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CDController implements CDResource {

    @Autowired
    private AlbumService albumService;

    private final Logger LOGGER = LoggerFactory.getLogger(CDController.class);

    @Override
    public ResponseEntity<List<Album>> getAllCd() {
        LOGGER.info("Searching for all albums");

        List<Album> responseList = albumService.findAllCd();

        return new ResponseEntity<>(responseList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Album> getAlbumByName(String name) {
        LOGGER.info("Searching for Album: {}", name);

        Album response = albumService.findByName(name);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
