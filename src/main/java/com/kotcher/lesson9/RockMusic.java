package com.kotcher.lesson9;

import org.springframework.stereotype.Component;

@Component("musicBean") //говорит спрингу о том,что нужно создать бин этого класса с ключем musicBean
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "PAM PAM PARAM";
    }
}
