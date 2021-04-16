package com.nucrime.todo.repository;

import com.nucrime.todo.model.Todo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Tag(name = "Todo API")
@RepositoryRestResource
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
