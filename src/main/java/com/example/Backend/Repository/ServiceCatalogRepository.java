package com.example.Backend.Repository;

import com.example.Backend.Entity.ServiceCatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceCatalogRepository extends JpaRepository<ServiceCatalogEntity, Long> {
}
