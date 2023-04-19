/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamunger.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author dmendes
 */
@Data
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idgame;
    private String gameName;
    private String publisher;
    private String genre;
    private String releaseDate;
}
