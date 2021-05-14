package com.nucrime.todo.model;

import org.springframework.lang.Nullable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class EntityWithId<PK extends Serializable> implements Serializable {

  @Id @GeneratedValue private @Nullable PK id;
}
