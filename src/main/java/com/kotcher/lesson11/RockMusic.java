package com.kotcher.lesson11;

import org.springframework.stereotype.Component;

@Component("rock") //говорит спрингу о том,что нужно создать бин этого класса с ключем musicBean
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "PAM PAM PARAM";
    }
}
