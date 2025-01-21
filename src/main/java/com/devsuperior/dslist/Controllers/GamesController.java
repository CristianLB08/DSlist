package com.devsuperior.dslist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.Services.GameService;
import com.devsuperior.dslist.entities.Game;

@RestController
@RequestMapping(value="/games")
public class GamesController {

    @Autowired
    private GameService gameService;

    public List<Game> findAll(){
        List<Game> result = gameService.findAll();
        return result;
    }
}
