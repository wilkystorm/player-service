package com.practice.characterlevels.service;

import com.practice.characterlevels.entitiy.Player;

import java.util.List;
import java.util.Set;

public interface PlayerService {

    Player savePlayer(Player player);
    Player getPlayer(Long playerId);
    void deletePlayer(Long playerId);
    List<Player> getPlayers();

}
