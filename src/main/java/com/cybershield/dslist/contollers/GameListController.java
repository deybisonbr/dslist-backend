package com.cybershield.dslist.contollers;

import com.cybershield.dslist.dto.GameDTO;
import com.cybershield.dslist.dto.GameListDTO;
import com.cybershield.dslist.dto.GameMinDTO;
import com.cybershield.dslist.services.game.GameListService;
import com.cybershield.dslist.services.game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
       List<GameListDTO> result = gameListService.findAll();
       return result;
    }

}
