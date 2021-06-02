package com.appsdeveloperblog.ws.api.photos.controllers;

import com.appsdeveloperblog.ws.api.photos.model.Photo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photos")
public class PhotosController {

    @GetMapping
    public List<Photo> getPhotos() {

        Photo photo1 = new Photo();
        photo1.setAlbumId("albumIdHere");
        photo1.setPhotoId("1");
        photo1.setUserId("1");
        photo1.setPhotoTitle("Photo 1 title");
        photo1.setPhotoDescription("Photo 1 description");
        photo1.setPhotoUrl("Photo 1 URL");

        Photo photo2 = new Photo();
        photo2.setAlbumId("albumIdHere");
        photo2.setPhotoId("2");
        photo2.setUserId("1");
        photo2.setPhotoTitle("Photo 2 title");
        photo2.setPhotoDescription("Photo 2 description");
        photo2.setPhotoUrl("Photo 2 URL");

        return Arrays.asList(photo1, photo2);
    }
}
