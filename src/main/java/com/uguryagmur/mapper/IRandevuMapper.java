/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uguryagmur.mapper;

import com.uguryagmur.dto.request.RandevuSaveRequestDto;
import com.uguryagmur.dto.response.RandevuResponseDto;
import com.uguryagmur.repository.entity.Randevu;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author ugurg
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRandevuMapper {
  IRandevuMapper INSTANCE=Mappers.getMapper(IRandevuMapper.class);
  
  Randevu dtoToRandevu(RandevuSaveRequestDto dto);
  RandevuResponseDto randevuToDto(Randevu randevu);
}
