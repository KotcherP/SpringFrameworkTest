package com.kotcher.lesson12;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//старый способ прописывания зависимостей бинов (xml + код java)

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContext_12.xml"
        );

//        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicalMusic classicalMusic = context.getBean("classic",ClassicalMusic.class);
//        System.out.println(classicalMusic);
//        ClassicalMusic classicalMusic1 = context.getBean("classic",ClassicalMusic.class);
//        System.out.println(classicalMusic1);


        RockMusic rockMusic = context.getBean("rock",RockMusic.class);

        context.close();

    }
}
