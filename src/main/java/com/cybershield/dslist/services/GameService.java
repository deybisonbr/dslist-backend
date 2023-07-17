package com.cybershield.dslist.services;

import com.cybershield.dslist.dto.GameMinDTO;
import com.cybershield.dslist.entities.Game;
import com.cybershield.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameReporitory;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameReporitory.findAll();
        List<GameMinDTO> dto = result.stream().map(game -> new GameMinDTO(game)).toList();
        return dto;
    }
}
