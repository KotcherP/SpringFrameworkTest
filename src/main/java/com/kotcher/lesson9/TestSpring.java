package com.kotcher.lesson9;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//старый способ прописывания зависимостей бинов (xml + код java)

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext_9.xml"
        );

        Music music = context.getBean("musicBean",Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();

    }
}
