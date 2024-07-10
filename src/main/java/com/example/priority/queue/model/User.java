package com.example.priority.queue.model;

import com.example.priority.queue.enums.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private int id;
  private Category category;

}