package com.digitalojt.dev;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/drone")
public class DroneController {
  private final DroneRepository repository;

  @GetMapping
  public List<Drone> listDrone() {
      List<Drone> list = repository.getAll();
      return list;
    }
}
