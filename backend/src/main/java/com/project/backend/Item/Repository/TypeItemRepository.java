package com.project.backend.Item.Repository;

import com.project.backend.Item.Entity.TypeItem;
import java.util.Collection;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface TypeItemRepository extends JpaRepository<TypeItem, Long> {
    TypeItem findById(long id);
}