/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamunger.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author dmendes
 */
@Data
@Entity
public class FavoriteGame {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idfavoritegame;
    @OneToOne
    @JoinColumn(referencedColumnName = "iduser")
    private User user;
    @OneToOne
    @JoinColumn(referencedColumnName = "idgame")
    private Game game;
}
