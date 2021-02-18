package com.project.backend.Mode.Repository;

import com.project.backend.Mode.Entity.Rank;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface RankRepository extends JpaRepository<Rank, Long> {
    Rank findById(long id);
}
