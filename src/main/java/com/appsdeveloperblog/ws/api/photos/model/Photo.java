package com.appsdeveloperblog.ws.api.photos.model;

import lombok.Data;

@Data
public class Photo {
    private String userId;
    private String photoId;
    private String albumId;
    private String photoTitle;
    private String photoDescription;
    private String photoUrl;
}
