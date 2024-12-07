package com.practice.player.service;

import com.practice.player.entitiy.Player;

import java.util.List;

public interface PlayerService {

    Player savePlayer(Player player);
    Player getPlayer(Long playerId);
    void deletePlayer(Long playerId);
    List<Player> getPlayers();

}
