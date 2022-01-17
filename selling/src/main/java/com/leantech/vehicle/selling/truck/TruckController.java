package com.leantech.vehicle.selling.truck;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("selling/truck")
public class TruckController {

  @GetMapping()
  public ResponseEntity<String> getAll() {
    return ResponseEntity.ok().body("You are looking for all available trucks to sell");
  }

}
