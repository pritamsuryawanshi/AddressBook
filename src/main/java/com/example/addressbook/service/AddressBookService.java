package com.example.addressbook.service;

import com.example.addressbook.dto.PersonDto;
import com.example.addressbook.entity.Contact;
import com.example.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookService {

    @Autowired
    AddressBookRepository addressBookRepository;

    public void addContact(PersonDto personDto) {
        Contact contact = new Contact();
        contact.name = personDto.name;
        contact.phoneNumber = personDto.number;
        addressBookRepository.save(contact);
    }

    public List<Contact> getContact() {
        List<Contact> contactList = addressBookRepository.findAll();
        return contactList;
    }
}
