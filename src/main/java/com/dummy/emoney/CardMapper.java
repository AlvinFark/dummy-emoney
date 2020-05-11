package com.dummy.emoney;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardMapper {

  String getAll = "SELECT * FROM card";

  @Select(getAll)
  List<Card> getAll();
}
