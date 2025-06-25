package com.example.Backend.Repository;




import com.example.Backend.Entity.TestimonialsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestimonialsRepo extends JpaRepository<TestimonialsEntity, Integer> {
}

