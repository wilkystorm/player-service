package com.practice.player.entitiy;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Name must be filled in")
    @NonNull
    @Column(name = "player_name")
    private String playerName;

    @NotBlank(message = "Email must be filled in")
    @NonNull
    @Column(name = "email")
    private String email;



}
