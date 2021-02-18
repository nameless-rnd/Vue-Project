package com.project.backend.Effect.Repository;

import com.project.backend.Effect.Entity.Effect;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface EffectRepository extends JpaRepository<Effect, Long> {
    Effect findById(long id);
}