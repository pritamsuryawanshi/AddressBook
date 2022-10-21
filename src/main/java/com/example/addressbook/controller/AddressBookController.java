package com.example.addressbook.controller;

import com.example.addressbook.dto.PersonDto;
import com.example.addressbook.entity.Contact;
import com.example.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressBookController {
    //controller --> service --> repository
// get put post delete patch
    @Autowired
    AddressBookService addressBookService;

    @PostMapping("add")
    public void addPolicy(@RequestBody PersonDto personDto) {
        addressBookService.addContact(personDto);
    }

    @GetMapping("getcontact")
    public List<Contact> getContact() {
        return addressBookService.getContact();
    }
}
