package com.project.backend.Comment.Repository;

import com.project.backend.Comment.Entity.Comment;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface CommentRepository extends JpaRepository<Comment, Long> {
  Comment findById(long id);
}
