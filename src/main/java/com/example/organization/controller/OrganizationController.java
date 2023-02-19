package com.example.organization.controller;

import com.example.organization.model.Organization;
import com.example.organization.repo.OrganizationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/org")
@RequiredArgsConstructor
public class OrganizationController {
    private final OrganizationRepo repo;

    @GetMapping("/all")
    public List <Organization> getAllOrgan(){
        return repo.findAll();
    }
}
