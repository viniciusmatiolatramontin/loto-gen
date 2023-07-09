package com.lottery.lotoapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.lotoapi.model.ResultMegaSena;
import com.lottery.lotoapi.repository.ResultMegaSenaRepository;

@Service
public class MegaSenaService {

    @Autowired
    private ResultMegaSenaRepository repo;

    public ResultMegaSena generateMegaSena(Integer qtd) {
        if(qtd > 15 || qtd < 6 || qtd == null){
            throw new IllegalArgumentException("Quantidade de dezenas deve ser um numero de 6 ate 15");
        }

        List<Integer> results = new ArrayList<Integer>();

        Integer number = null;

        for(int i = 0; i < qtd; i++){
            do {
                number = ThreadLocalRandom.current().nextInt(1, 61);
            } while(results.contains(number));

            results.add(number);
        }

        ResultMegaSena resultReturned = new ResultMegaSena(results);

        repo.save(resultReturned);

        return resultReturned;
    }

    public List<ResultMegaSena> getMegaSenaHistory() {
        return repo.findAll();
    }
}
