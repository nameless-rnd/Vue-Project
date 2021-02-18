package com.project.backend.Skin.Repository;

import com.project.backend.Skin.Entity.Skin;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface SkinRepository extends JpaRepository<Skin, Long> {
    Skin findById(long id);
}