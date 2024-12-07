package com.practice.player.Service;


import com.practice.player.entitiy.Player;
import com.practice.player.repository.PlayerRepository;
import com.practice.player.service.PlayerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class PlayerServiceTest {

    @Mock
    PlayerRepository playerRepository;

    @InjectMocks
    PlayerService playerService;

    @Test
    void savePlayerTest(){
        Player expectedPlayer = new Player();
        when(playerRepository.save(expectedPlayer)).thenReturn(expectedPlayer);

        Player actual = playerService.savePlayer(expectedPlayer);

        assertThat(actual).isEqualTo(expectedPlayer);

    }
}
