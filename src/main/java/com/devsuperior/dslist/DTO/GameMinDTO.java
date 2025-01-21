package com.devsuperior.dslist.DTO;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
    
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
        
    }
    public GameMinDTO(Game entitie) {
        this.id = entitie.getId();
        this.imgUrl = entitie.getImgUrl();
        this.shortDescription = entitie.getShortDescription();
        this.title = entitie.getTitle();
        this.year = entitie.getYear();
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
