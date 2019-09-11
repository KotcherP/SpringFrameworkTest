package com.kotcher.lesson12;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classic")
@Scope("prototype")
public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyItin(){
        System.out.println("init!");
    }

    public void doMyDestroy(){
        System.out.println("destroy!");
    }

    @Override
    public String getSong() {
        return "tu ru tu tu";
    }
}
