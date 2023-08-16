package com.betrybe.agrix.farm.model.repository;

import com.betrybe.agrix.farm.model.entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * CropRepository repository to service.
 */

@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {
}
