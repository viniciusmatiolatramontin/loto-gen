package com.lottery.lotoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.lotoapi.model.ResultLotoFacil;
import com.lottery.lotoapi.service.LotoFacilService;

@RestController
@RequestMapping("/lotofacil")
public class LotoFacilController {
    
    @Autowired
    private LotoFacilService service;

    @GetMapping("/{qtd}")
    public ResultLotoFacil generateLotoFacil(@PathVariable Integer qtd, Authentication authentication) {
        return service.generateLotoFacil(qtd, authentication.getName());
    }

    @GetMapping("/recrutador/{qtd}")
    public ResultLotoFacil generateLotoFacil(@PathVariable Integer qtd) {
        return service.generateLotoFacil(qtd, "recrutador");
    }

    @GetMapping("/historico")
    public List<ResultLotoFacil> getLotoFacilHistory(Authentication authentication) {
        return service.getLotoFacilHistory(authentication.getName());
    }

    @GetMapping("recrutador/historico")
    public List<ResultLotoFacil> getLotoFacilHistory() {
        return service.getLotoFacilHistory("recrutador");
    }
}
