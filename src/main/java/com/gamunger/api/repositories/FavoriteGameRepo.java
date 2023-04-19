/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gamunger.api.repositories;

import com.gamunger.api.entities.FavoriteGame;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dmendes
 */
public interface FavoriteGameRepo extends CrudRepository<FavoriteGame, Object>{
    
}
