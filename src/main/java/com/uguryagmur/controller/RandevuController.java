/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.controller;

import static com.uguryagmur.constants.RestApiList.*;
import com.uguryagmur.dto.request.RandevuSaveRequestDto;
import com.uguryagmur.dto.response.RandevuResponseDto;
import com.uguryagmur.repository.entity.Randevu;
import com.uguryagmur.services.RandevuService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ugurg
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(RANDEVU)
public class RandevuController {
   private final RandevuService service; 
    
    @PostMapping(SAVEDTO)
    public RandevuResponseDto save(@Valid RandevuSaveRequestDto dto){
      return service.save(dto); 
    }
    @GetMapping(FINDALL)
    public List<RandevuResponseDto> findAll(){
       return service.findAllActiveRandevu();
    }
    @PostMapping(CANCEL)
    public List<RandevuResponseDto> cancel(String name,String phone){
        return service.cancel(name,phone);
    }
            
}
