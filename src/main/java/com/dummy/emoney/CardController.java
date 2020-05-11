package com.dummy.emoney;

import org.apache.ibatis.session.SqlSession;
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

  CardMapper cardMapper;

  @GetMapping
  public ResponseEntity<?> getAll(){
    List<Card> cards = cardMapper.getAll();
    return new ResponseEntity<>(cards, HttpStatus.OK);
  }
}
