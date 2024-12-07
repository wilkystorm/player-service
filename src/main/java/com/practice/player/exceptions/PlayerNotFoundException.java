package com.practice.player.exceptions;

public class PlayerNotFoundException extends RuntimeException {

    public PlayerNotFoundException(Long playerId){
        super("The Player with an Id of '" + playerId + "' does not exist");
    }
}
