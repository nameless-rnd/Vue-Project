package com.project.backend.User.Repository;

import com.project.backend.User.Entity.User;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
  User findById(long id);

  @Query(
    value = "SELECT * FROM User o where o.username = :username and o.password = :password",
    nativeQuery = true
  )
  Collection<User> findUserByUsername(
    @Param("username") String username,
    @Param("password") String password
  );
}
