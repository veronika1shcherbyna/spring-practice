package l2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("popMusic")
    private Music music;

    public void playMusic() {
            System.out.println("Playing:" + music.getSong());
    }
}
