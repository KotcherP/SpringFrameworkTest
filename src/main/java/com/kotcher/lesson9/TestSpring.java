package com.kotcher.lesson9;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//старый способ прописывания зависимостей бинов (xml + код java)

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext_9.xml"
        );

//        Music music = context.getBean("musicBean",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music classicalMusic = context.getBean("classicalMusic",Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
//        classicalMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);

        context.close();

    }
}
