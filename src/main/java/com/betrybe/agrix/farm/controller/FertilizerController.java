package com.betrybe.agrix.farm.controller;

import com.betrybe.agrix.farm.model.entity.Fertilizer;
import com.betrybe.agrix.farm.service.FertilizerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Fertilizer Controller.
 */

@RestController
@RequestMapping("/fertilizers")
public class FertilizerController {

  private final FertilizerService fertilizerService;

  public FertilizerController(FertilizerService fertilizerService) {
    this.fertilizerService = fertilizerService;
  }

  /**
   * createFertilizer = Cria uma novo fertilizer.
   *
   * @param fertilizer informações do fertilizer.
   * @return HTTP status.CREATED 201 e um fertilizerDto.
   */
  @PostMapping()
  public ResponseEntity<Fertilizer> createFertilizer(@RequestBody Fertilizer fertilizer) {
    Fertilizer newFertilizer = fertilizerService.insertFertilizer(fertilizer);
    return ResponseEntity.status(HttpStatus.CREATED).body(newFertilizer);
  }


}
