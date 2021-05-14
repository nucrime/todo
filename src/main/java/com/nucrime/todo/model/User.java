package com.nucrime.todo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "users")
@Data
// todo take it from challenger, as well as the structure of security, so that we can log in through google
public class User extends EntityWithId<Long> {
    private String nickname;
    @OneToMany(
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<Todo> todos;
}
