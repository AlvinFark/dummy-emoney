package com.dummy.emoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/card")
public class CardController {

  @Autowired
  CardRepository cardRepository;

  @GetMapping
  public ResponseEntity<?> getAll(){
    List<Card> cards = cardRepository.findAll();
    return new ResponseEntity<>(cards, HttpStatus.OK);
  }
}
