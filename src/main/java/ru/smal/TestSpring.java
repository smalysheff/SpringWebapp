package ru.smal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");


        Music classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        Music rockMusic = context.getBean("rockMusicBean", RockMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic);
        System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());
        musicPlayer.playMusic();


//


        context.close();
    }
}
