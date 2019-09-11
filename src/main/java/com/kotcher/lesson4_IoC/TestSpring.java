package com.kotcher.lesson4_IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//старый способ прописывания зависимостей бинов (xml + код java)

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //внедрение вручную через конструктор уже устарело
        //Music music = context.getBean("musicBean",Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //внедрение через спринг (в xml applicationContext)
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();

    }
}
