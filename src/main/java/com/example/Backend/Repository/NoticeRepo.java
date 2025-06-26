package com.example.Backend.Repository;

import com.example.Backend.Entity.NoticeE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepo extends JpaRepository<NoticeE, Integer> {}
