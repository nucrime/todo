package com.nucrime.todo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Todo extends EntityWithId<Long> {
    private String content;
    @ManyToOne
    private User userId;
}
