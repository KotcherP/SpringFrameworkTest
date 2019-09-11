package com.kotcher.lesson12;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rock") //говорит спрингу о том,что нужно создать бин этого класса с ключем musicBean
public class RockMusic implements Music {

    public RockMusic() {
        System.out.println("constructor");
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("init go");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destroy go");
    }

    @Override
    public String getSong() {
        return "PAM PAM PARAM";
    }
}
