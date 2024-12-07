package com.practice.player.service;

import com.practice.player.entitiy.Player;
import com.practice.player.exceptions.PlayerNotFoundException;
import com.practice.player.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PlayerServiceImpl implements PlayerService{

    PlayerRepository playerRepository;

    @Override
    public Player savePlayer(Player player){
        return playerRepository.save(player);
    }

    @Override
    public Player getPlayer(Long playerId){
        Optional<Player> player = playerRepository.findById(playerId);
        return unwrapPlayer(player, playerId);
    }

    @Override
    public void deletePlayer(Long playerId){
        playerRepository.deleteById(playerId);
    }

    @Override
    public List<Player> getPlayers(){
        return (List<Player>)playerRepository.findAll();
    }


    static Player unwrapPlayer(Optional<Player> entity, Long playerId){
        if (entity.isPresent()) return entity.get();
        else throw new PlayerNotFoundException(playerId);
    }
}
