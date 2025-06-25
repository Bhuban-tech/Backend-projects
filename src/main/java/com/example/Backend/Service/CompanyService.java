package com.example.Backend.Service;




import com.example.Backend.Dtos.TestimonialsDtos;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CompanyService {

    TestimonialsDtos addTestimonial(TestimonialsDtos dto, MultipartFile file) throws IOException;

    TestimonialsDtos getTestimonialById(Integer id);

    List<TestimonialsDtos> getAll();

    TestimonialsDtos updateTestimonial(TestimonialsDtos dto, MultipartFile file) throws IOException;

    boolean deleteTestimonial(Integer id);
}
