/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamunger.api.controllers;

import com.gamunger.api.entities.Game;
import com.gamunger.api.repositories.GameRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dmendes
 */
@RestController
@RequestMapping("game")
public class GameController extends BaseController<Game>{
    
    public GameController(GameRepo repo) {
        super(repo);
    }
    
}
