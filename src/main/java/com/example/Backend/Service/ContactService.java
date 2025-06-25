package com.example.Backend.Service;

import com.example.Backend.Entity.ContactEntity;
import com.example.Backend.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactEntity submit(ContactEntity contact) {
        return contactRepository.save(contact);
    }

    public List<ContactEntity> getAll() {
        return contactRepository.findAll();
    }

    public void delete(Long id) {
        contactRepository.deleteById(id);
    }
}
