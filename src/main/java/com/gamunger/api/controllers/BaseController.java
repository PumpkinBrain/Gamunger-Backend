/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gamunger.api.controllers;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dmendes
 * @param <T>
 */
public class BaseController<T> {
    
    CrudRepository repo;

    public BaseController(CrudRepository repo) {
        this.repo = repo;
    }
    
    @GetMapping("/listall")
    public List<T> getAll(){
        return (List<T>) repo.findAll();
    }
    
    @PostMapping("/save")
    public void save(T obj){
        repo.save(obj);
    }
    
    @DeleteMapping("/deleteall")
    public void deleteAll(){
        repo.deleteAll();
    }
}
