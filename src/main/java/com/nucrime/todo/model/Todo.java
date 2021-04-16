package com.nucrime.todo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Todo {
    @Id
    private Long id;
    private String content;
}
