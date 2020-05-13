package com.example.music.application.resource;

import com.example.music.domain.model.Album;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Validate email domain")
public interface CDResource {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok", response = Boolean.class),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation(value="Get CD information")
    @GetMapping(value = "/search/all",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<List<Album>> getAllCd();

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok", response = Boolean.class),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error")
    })
    @ApiOperation(value="Get Album information")
    @GetMapping(value = "/search/{name}",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity <Album> getAlbumByName(@PathVariable String name);

}
