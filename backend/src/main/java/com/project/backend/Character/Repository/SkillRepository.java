package com.project.backend.Character.Repository;

import com.project.backend.Character.Entity.Skill;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface SkillRepository extends JpaRepository<Skill, Long> {
    Skill findById(long id);
}