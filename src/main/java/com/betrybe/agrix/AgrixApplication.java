package com.betrybe.agrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Application main class.
 */
@SpringBootApplication
@EntityScan("com.betrybe.agrix.farm.model.entities")
@EnableJpaRepositories("com.betrybe.agrix.farm.model.repositories")
@ComponentScan("com.betrybe.agrix.farm")
public class AgrixApplication {

  public static void main(String[] args) {
    SpringApplication.run(AgrixApplication.class, args);
  }

}