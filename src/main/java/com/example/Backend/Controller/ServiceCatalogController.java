package com.example.Backend.Controller;

import com.example.Backend.Entity.ServiceCatalogEntity;
import com.example.Backend.Service.ServiceCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceCatalogController {

    @Autowired
    private ServiceCatalogService serviceService;

    @GetMapping
    public List<ServiceCatalogEntity> getAll() {
        return serviceService.getAllServices();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceCatalogEntity> getById(@PathVariable Long id) {
        return serviceService.getServiceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ServiceCatalogEntity create(@RequestBody ServiceCatalogEntity newService) {
        return serviceService.createService(newService);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiceCatalogEntity> update(@PathVariable Long id, @RequestBody ServiceCatalogEntity updatedService) {
        return serviceService.updateService(id, updatedService)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean deleted = serviceService.deleteService(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ServiceCatalogEntity> uploadService(
            @RequestPart("service_name") String name,
            @RequestPart("service_description") String desc,
            @RequestPart("image") MultipartFile file) throws IOException {

        ServiceCatalogEntity service = serviceService.createServiceWithImage(name, desc, file);
        return ResponseEntity.ok(service);
    }
}