package com.example.addressbook.repository;

import com.example.addressbook.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<Contact, Integer> {
}
