package com.practice.player.controller;

import com.practice.player.entitiy.Player;
import com.practice.player.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/player")
public class PlayerController {

    PlayerService playerService;

    @PostMapping
    public ResponseEntity<Player> savePlayer(@RequestBody Player player){
        return new ResponseEntity<>(playerService.savePlayer(player), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayer(@PathVariable Long id){
        return new ResponseEntity<>(playerService.getPlayer(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deletePlayer(@PathVariable Long id){
        playerService.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Player>> getPlayers(){
        return new ResponseEntity<>(playerService.getPlayers(), HttpStatus.OK);
    }

}
