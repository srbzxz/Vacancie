package com.example.vacancie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vacancies")
public class VacanciesController {

    private final VacanciesService vacanciesService;

    @Autowired
    public VacanciesController(VacanciesService vacanciesService) {
        this.vacanciesService = vacanciesService;
    }

    @GetMapping
    public ResponseEntity getAllVacancies(@RequestParam("area") Integer area) {
        return ResponseEntity.ok(vacanciesService.getAllVacancies(area).getItems());
    }

}
