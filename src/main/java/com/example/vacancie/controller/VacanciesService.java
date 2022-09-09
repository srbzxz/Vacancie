package com.example.vacancie.controller;

import com.example.vacancie.entity.Vacancies;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class VacanciesService {

    private RestTemplate restTemplate = new RestTemplate();
    private static final String hhApi = "https://api.hh.ru/vacancies";

    public Vacancies getAllVacancies(Integer area) {
        return restTemplate.getForEntity(hhApi + "?area=" + area, Vacancies.class).getBody();
    }
}
