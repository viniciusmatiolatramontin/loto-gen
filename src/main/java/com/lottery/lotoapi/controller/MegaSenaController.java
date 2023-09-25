package com.lottery.lotoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
    public ResultMegaSena generateMegaSena(@PathVariable Integer qtd, Authentication authentication) {
        return service.generateMegaSena(qtd, authentication.getName());
    }

    @GetMapping("/recrutador/{qtd}")
    public ResultMegaSena generateMegaSenaRecruiter(@PathVariable Integer qtd) {
        return service.generateMegaSena(qtd, "recrutador");
    }

    @GetMapping("/historico")
    public List<ResultMegaSena> getMegaSenaHistory(Authentication authentication) {
        return service.getMegaSenaHistory(authentication.getName());
    }

    @GetMapping("/recrutador/historico")
    public List<ResultMegaSena> getMegaSenaHistoryRecruiter() {
        return service.getMegaSenaHistory("recrutador");
    }
    
}
