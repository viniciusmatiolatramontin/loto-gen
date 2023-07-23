package com.lottery.lotoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
    public ResultLotoFacil generateLotoFacil(@PathVariable Integer qtd) {
        return service.generateLotoFacil(qtd);
    }

    @GetMapping("/historico")
    public List<ResultLotoFacil> getLotoFacilHistory() {
        return service.getLotoFacilHistory();
    }
}
