package com.kotcher.lesson11;

import org.springframework.stereotype.Component;

@Component("classic")
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
