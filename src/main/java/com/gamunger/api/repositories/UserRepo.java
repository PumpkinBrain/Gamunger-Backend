/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamunger.api.repositories;

import com.gamunger.api.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dmendes
 */
public interface UserRepo extends CrudRepository<User, Object>{
    
}
