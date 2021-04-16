package com.nucrime.todo.repository;

import com.nucrime.todo.model.User;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Tag(name = "User API")
@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
}
