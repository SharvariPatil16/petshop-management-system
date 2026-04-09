package com.petshop.petservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petshop.petservice.entity.EmployeePet;
import com.petshop.petservice.service.EmployeePetService;

@RestController
@RequestMapping("/pets")
public class EmployeePetController {

    @Autowired
    private EmployeePetService service;

    @PostMapping("/{petId}/employee/{empId}")
    public EmployeePet assign(@PathVariable Long petId,
                              @PathVariable Long empId) {

        return service.assign(empId, petId);
    }
}