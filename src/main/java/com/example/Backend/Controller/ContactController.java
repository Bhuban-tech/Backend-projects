package com.example.Backend.Controller;

import com.example.Backend.Entity.ContactEntity;
import com.example.Backend.Service.ContactService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping
    public ContactEntity submit(@Valid @RequestBody ContactEntity contactEntity) {
        return contactService.submit(contactEntity);
    }

    @GetMapping
    public List<ContactEntity> getAll() {
        return contactService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        contactService.delete(id);
    }
}
