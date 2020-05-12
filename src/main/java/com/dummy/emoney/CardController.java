package com.dummy.emoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/{number}")
  public ResponseEntity<?> checkExist(@PathVariable String number){
    Boolean exist = cardRepository.existsByNumber(number);
    if (!exist) {
      return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(true, HttpStatus.OK);
  }
}
