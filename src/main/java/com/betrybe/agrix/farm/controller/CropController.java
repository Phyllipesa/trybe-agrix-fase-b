package com.betrybe.agrix.farm.controller;

import com.betrybe.agrix.farm.controller.dto.CropDto;
import com.betrybe.agrix.farm.model.entity.Crop;
import com.betrybe.agrix.farm.service.CropService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Crop Controller.
 */

@RestController
@RequestMapping(value = "/crops")
public class CropController {

  private final CropService cropService;

  public CropController(CropService cropService) {
    this.cropService = cropService;
  }

  /**
   * getAllCrops = Lista todas as crops registradas no DB.
   *
   * @return HTTP status 200 e a lista de cropDto.
   */
  @GetMapping()
  public ResponseEntity<List<CropDto>> getAllCrops() {
    List<Crop> allCrops = cropService.getAllCrops();
    List<CropDto> cropsDtoList = allCrops.stream()
        .map(crop -> CropDto.cropEntityToDto(crop))
        .toList();

    return ResponseEntity.ok(cropsDtoList);
  }

  /**
   * getCropById.
   *
   * @param id = ID da crop a ser buscada.
   * @return HTTP status.OK 200 e cropDto.
   */
  @GetMapping("/{id}")
  public ResponseEntity<CropDto> getCropById(@PathVariable Long id) {
    Crop crop = cropService.getCropById(id);
    CropDto cropDto = CropDto.cropEntityToDto(crop);
    return ResponseEntity.ok(cropDto);
  }
}
