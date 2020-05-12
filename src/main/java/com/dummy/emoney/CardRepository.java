package com.dummy.emoney;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
  List<Card> findAll();
  Boolean existsByNumber(String number);
  Card getByNumber(String number);
}
