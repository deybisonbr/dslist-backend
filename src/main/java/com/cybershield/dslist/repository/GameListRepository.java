package com.cybershield.dslist.repository;

import com.cybershield.dslist.entities.Game;
import com.cybershield.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
