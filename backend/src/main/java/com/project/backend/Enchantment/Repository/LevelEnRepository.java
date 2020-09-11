package com.project.backend.Enchantment.Repository;

import com.project.backend.Enchantment.Entity.LevelEn;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface LevelEnRepository extends JpaRepository<LevelEn, Long> {
    LevelEn findById(long id);
}