package com.leantech.vehicle.buying.car;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("buying/car")
public class CarController {

  @GetMapping()
  public ResponseEntity<String> getAll() {
    return ResponseEntity.ok().body("You are looking for all available cars to buy");
  }

}
