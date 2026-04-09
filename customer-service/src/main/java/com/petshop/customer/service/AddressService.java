package com.petshop.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.petshop.customer.entity.Address;
import com.petshop.customer.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository repository;

    
    public Address save(Address address) {
        return repository.save(address);
    }

    
    public List<Address> getAll() {
        return repository.findAll();
    }

    
    public Optional<Address> getById(Long id) {
        return repository.findById(id);
    }

    
    public String delete(Long id) {
        repository.deleteById(id);
        return "Address deleted successfully!";
    }

    
    public Address update(Long id, Address newAddress) {
        return repository.findById(id).map(address -> {
            address.setCity(newAddress.getCity());
            address.setState(newAddress.getState());
            return repository.save(address);
        }).orElseThrow(() -> new RuntimeException("Address not found"));
    }
}