package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicKind musicKind) {
        List<String> songList = new ArrayList<>();
        switch (musicKind) {
            case CLASSICAL:
                songList = music2.getSong();
            break;
            case ROCK:
                songList = music1.getSong();
            break;
        }

        Random rnd = new Random();
        return "Playing: " + songList.get(rnd.nextInt(3));
    }
}
