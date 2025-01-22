package com.devsuperior.dslist.entities;


import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPk {

    @ManyToOne
    @JoinColumn(name="game_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name="list_id")
    private GameList List;


    public  BelongingPk(){

        
    }

    public BelongingPk(Game game, GameList list) {
        this.game = game;
        List = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return List;
    }

    public void setList(GameList list) {
        List = list;
    }





}


