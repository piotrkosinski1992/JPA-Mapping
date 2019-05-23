package com.jpa.mappingrelations.onetomany.repo;

import com.jpa.mappingrelations.onetomany.RowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RowRepo extends JpaRepository<RowEntity, String> {
}
