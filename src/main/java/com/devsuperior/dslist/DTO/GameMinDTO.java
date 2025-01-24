package com.devsuperior.dslist.DTO;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projection.GameMinProjection;


public class GameMinDTO {
    
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
        
    }

    public GameMinDTO(Game entity) {
        id = entity.getId();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
        title = entity.getTitle();
        year = entity.getYear();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
        title = projection.getTitle();
        year = projection.getYear();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }


    
}
