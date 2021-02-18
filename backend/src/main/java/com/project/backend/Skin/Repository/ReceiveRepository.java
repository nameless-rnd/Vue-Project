package com.project.backend.Skin.Repository;

import com.project.backend.Skin.Entity.Receive;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface ReceiveRepository extends JpaRepository<Receive, Long> {
    Receive findById(long id);
}