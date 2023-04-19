/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamunger.api.controllers;

import com.gamunger.api.entities.FavoriteGame;
import com.gamunger.api.repositories.FavoriteGameRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dmendes
 */
@RestController
@RequestMapping("favoritegame")
public class FavoriteGameController extends BaseController<FavoriteGame>{
    
    public FavoriteGameController(FavoriteGameRepo repo) {
        super(repo);
    }
    
}
