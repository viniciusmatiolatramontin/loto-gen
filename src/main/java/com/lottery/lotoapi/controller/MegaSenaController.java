package com.lottery.lotoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.lotoapi.model.ResultMegaSena;
import com.lottery.lotoapi.service.MegaSenaService;


@RestController
@RequestMapping("/megasena")
public class MegaSenaController {
    
    @Autowired
    private MegaSenaService service;

    @GetMapping("/{qtd}")
    public ResultMegaSena generateMegaSena(@PathVariable Integer qtd) {
        return service.generateMegaSena(qtd);
    }

}
