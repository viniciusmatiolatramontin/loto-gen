package com.lottery.lotoapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultMegaSena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer number1st;
    private Integer number2nd;
    private Integer number3rd;
    private Integer number4th;
    private Integer number5th;
    private Integer number6th;
    private Integer number7th;
    private Integer number8th;
    private Integer number9th;
    private Integer number10th;
    private Integer number11th;
    private Integer number12th;
    private Integer number13th;
    private Integer number14th;
    private Integer number15th;

    public ResultMegaSena(List<Integer> results) {
        setUntil6thNumber(results);
        setUntil15thNumber(results);
    }

    public ResultMegaSena() {

    }

    public Integer getNumber1st() {
        return number1st;
    }

    public Integer getNumber2nd() {
        return number2nd;
    }

    public Integer getNumber3rd() {
        return number3rd;
    }

    public Integer getNumber4th() {
        return number4th;
    }

    public Integer getNumber5th() {
        return number5th;
    }

    public Integer getNumber6th() {
        return number6th;
    }

    public Integer getNumber7th() {
        return number7th;
    }

    public Integer getNumber8th() {
        return number8th;
    }

    public Integer getNumber9th() {
        return number9th;
    }

    public Integer getNumber10th() {
        return number10th;
    }

    public Integer getNumber11th() {
        return number11th;
    }

    public Integer getNumber12th() {
        return number12th;
    }

    public Integer getNumber13th() {
        return number13th;
    }

    public Integer getNumber14th() {
        return number14th;
    }

    public Integer getNumber15th() {
        return number15th;
    }

    private void setUntil6thNumber(List<Integer> results){
        number1st = results.get(0);
        number2nd = results.get(1);
        number3rd = results.get(2);
        number4th = results.get(3);
        number5th = results.get(4);
        number6th = results.get(5);
    }
    
    private void setUntil15thNumber(List<Integer> results){
        if (results.size() > 6) {
            number7th = results.get(6);
        }
        if (results.size() > 7) {
            number8th = results.get(7);
        }
        if (results.size() > 8) {
            number9th = results.get(8);
        }
        if (results.size() > 9 ) {
            number10th = results.get(9);
        }
        if (results.size() > 10) {
            number11th = results.get(10);
        }
        if (results.size() > 11) {
            number12th = results.get(11);
        }
        if (results.size() > 12) {
            number13th = results.get(12);
        }
        if (results.size() > 13) {
            number14th = results.get(13);
        }
        if (results.size() > 14) {
            number15th = results.get(14);
        }
    }

}
