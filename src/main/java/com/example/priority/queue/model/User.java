package com.example.priority.queue.model;

import com.example.priority.queue.enums.Category;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private int id;
    private Category category;

      @JsonCreator
    public User(@JsonProperty("id") int id, @JsonProperty("category") Category category) {
        this.id = id;
        this.category = category;
    }


}
