package l2;

import l1.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Music musicBean = context.getBean("musicBean", ClassicalMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        musicPlayer.playMusic();

        context.close();
    }
}
