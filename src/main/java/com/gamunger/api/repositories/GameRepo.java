/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gamunger.api.repositories;

import com.gamunger.api.entities.Game;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dmendes
 */
public interface GameRepo extends CrudRepository<Game, Object>{
    
}
