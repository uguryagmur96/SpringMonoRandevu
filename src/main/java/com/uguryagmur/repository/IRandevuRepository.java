/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uguryagmur.repository;

import com.uguryagmur.repository.entity.Randevu;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ugurg
 */
@Repository
public interface IRandevuRepository extends JpaRepository<Randevu, Long> {
    
    List<Randevu> findAllByState(Boolean state);
    Randevu findByName(String name);
    
}
