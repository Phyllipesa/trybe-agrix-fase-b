package com.betrybe.agrix.farm.service;

import com.betrybe.agrix.farm.model.entity.Farm;
import com.betrybe.agrix.farm.model.entity.Fertilizer;
import com.betrybe.agrix.farm.model.repository.FertilizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Fertilizer Service.
 */

@Service
public class FertilizerService {

  @Autowired
  private final FertilizerRepository fertilizerRepository;

  public FertilizerService(FertilizerRepository fertilizerRepository) {
    this.fertilizerRepository = fertilizerRepository;
  }

  /**
   * insertFertilizer insere um novo fertilizer no DB.
   *
   * @param fertilizer informações do fertilizer a serem inseridas.
   * @return dados da fertilizer inserida.
   */
  public Fertilizer insertFertilizer(Fertilizer fertilizer) {
    return fertilizerRepository.save(fertilizer);
  }
}
