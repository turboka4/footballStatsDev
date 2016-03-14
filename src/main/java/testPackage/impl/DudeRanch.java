package testPackage.impl;

import org.springframework.stereotype.Component;
import testPackage.CompactDisk;

@Component
public class DudeRanch implements CompactDisk{


    private String title = "Dude Ranch";
    private String artist = "Blink 182";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
