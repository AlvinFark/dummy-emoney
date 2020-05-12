package com.dummy.emoney;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Card {

  @Id
  String number;

  long balance;

  public Card() {
  }

  public Card(String number, long balance) {
    this.number = number;
    this.balance = balance;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }
}
