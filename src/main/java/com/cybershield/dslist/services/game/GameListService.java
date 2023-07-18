package com.cybershield.dslist.services.game;

import com.cybershield.dslist.dto.GameDTO;
import com.cybershield.dslist.dto.GameListDTO;
import com.cybershield.dslist.dto.GameMinDTO;
import com.cybershield.dslist.entities.Game;
import com.cybershield.dslist.entities.GameList;
import com.cybershield.dslist.repository.GameListRepository;
import com.cybershield.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(game -> new GameListDTO(game)).toList();
        return dto;
    }

}
