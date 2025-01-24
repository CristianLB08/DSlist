package com.devsuperior.dslist.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.DTO.GameDTO;
import com.devsuperior.dslist.DTO.GameListDTO;
import com.devsuperior.dslist.Services.GameListService;
import com.devsuperior.dslist.Services.GameService;


@RestController
@RequestMapping(value="/lists")
public class GameListController{

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value="/{listId}")
    public GameDTO findByList(@PathVariable Long listId) {
        GameDTO result = gameService.findById(listId);
        return result;
    }


}