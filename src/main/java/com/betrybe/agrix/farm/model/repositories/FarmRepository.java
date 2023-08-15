package com.betrybe.agrix.farm.model.repositories;

import com.betrybe.agrix.farm.model.entities.Farm;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * FarmRepository repository to service.
 */
public interface FarmRepository extends JpaRepository<Farm, Long> {
}
