package com.project.backend.Post.Repository;

import com.project.backend.Post.Entity.Post;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface PostRepository extends JpaRepository<Post, Long> {
  Post findById(long id);
}
