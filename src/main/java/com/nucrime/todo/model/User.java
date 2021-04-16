package com.nucrime.todo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    private Long id;
    private String nickname;
    @OneToMany
    private List<Todo> todos;
}
