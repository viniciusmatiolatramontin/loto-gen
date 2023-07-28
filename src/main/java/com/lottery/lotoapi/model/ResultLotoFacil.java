package com.lottery.lotoapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = {"username"})
public class ResultLotoFacil {

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
    private Integer number16th;
    private Integer number17th;
    private Integer number18th;
    private Integer number19th;
    private Integer number20th;
    private String username;

    public ResultLotoFacil(List<Integer> results, String username) {
        setUntil15thNumber(results);
        setUntil20thNumber(results);
        setUsername(username);
    }

    public ResultLotoFacil() {

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

    public Integer getNumber16th() {
        return number16th;
    }

    public Integer getNumber17th() {
        return number17th;
    }

    public Integer getNumber18th() {
        return number18th;
    }

    public Integer getNumber19th() {
        return number19th;
    }

    public Integer getNumber20th() {
        return number20th;
    }

    private void setUntil15thNumber(List<Integer> results){
        number1st = results.get(0);
        number2nd = results.get(1);
        number3rd = results.get(2);
        number4th = results.get(3);
        number5th = results.get(4);
        number6th = results.get(5);
        number7th = results.get(6);
        number8th = results.get(7);
        number9th = results.get(8);
        number10th = results.get(9);
        number11th = results.get(10);
        number12th = results.get(11);
        number13th = results.get(12);
        number14th = results.get(13);
        number15th = results.get(14);
    }
    
    private void setUntil20thNumber(List<Integer> results) {
        if(results.size() > 15){
            number16th = results.get(15);
        }
        if(results.size() > 16){
            number17th = results.get(16);
        }
        if(results.size() > 17){
            number18th = results.get(17);
        }
        if(results.size() > 18){
            number19th = results.get(18);
        }
        if(results.size() > 19){
            number20th = results.get(19);
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    
}
