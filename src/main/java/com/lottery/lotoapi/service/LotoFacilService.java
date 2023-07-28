package com.lottery.lotoapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.lotoapi.model.ResultLotoFacil;
import com.lottery.lotoapi.repository.ResultLotoFacilRepository;

@Service
public class LotoFacilService {
    
    @Autowired
    private ResultLotoFacilRepository repo;

    public ResultLotoFacil generateLotoFacil(Integer qtd, String username) {
        if(qtd > 20 || qtd < 15 || qtd == null){
            throw new IllegalArgumentException("Quantidade de dezenas deve ser um numero de 15 ate 20");
        }

        List<Integer> results = new ArrayList<Integer>();

        Integer number = null;

        for(int i = 0; i < qtd; i++){
            do {
                number = ThreadLocalRandom.current().nextInt(1, 26);
            } while(results.contains(number));

            results.add(number);
        }

        ResultLotoFacil resultReturned = new ResultLotoFacil(results, username);

        repo.save(resultReturned);

        return resultReturned;
    }

    public List<ResultLotoFacil> getLotoFacilHistory(String username) {
        return repo.findAll().stream().filter(result -> result.getUsername().equals(username)).collect(Collectors.toList());
    }
}
