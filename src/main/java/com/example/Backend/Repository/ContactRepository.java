package com.example.Backend.Repository;

import com.example.Backend.Entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

}
