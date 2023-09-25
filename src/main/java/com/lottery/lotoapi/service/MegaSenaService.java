package com.lottery.lotoapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.lotoapi.model.ResultMegaSena;
import com.lottery.lotoapi.repository.ResultMegaSenaRepository;

@Service
public class MegaSenaService {

    @Autowired
    private ResultMegaSenaRepository repo;

    public ResultMegaSena generateMegaSena(Integer qtd, String username) {
        if(qtd > 15 || qtd < 6 || qtd == null){
            throw new IllegalArgumentException("Quantidade de dezenas deve ser um número de 6 até 15");
        }

        List<Integer> results = new ArrayList<Integer>();

        Integer number = null;

        for(int i = 0; i < qtd; i++){
            do {
                number = ThreadLocalRandom.current().nextInt(1, 61);
            } while(results.contains(number));

            results.add(number);
        }

        ResultMegaSena resultReturned = new ResultMegaSena(results, username);

        repo.save(resultReturned);

        return resultReturned;
    }

    public List<ResultMegaSena> getMegaSenaHistory(String username) {
        return repo.findAll().stream().filter(result -> result.getUsername().equals(username)).collect(Collectors.toList());
    }
}
