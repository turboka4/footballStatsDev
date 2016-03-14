package testPackage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import testPackage.CompactDisk;
import testPackage.MediaPlayer;

@Component
public class CdPlayer implements MediaPlayer {

    @Autowired
    private CompactDisk cd;

    @Override
    public void play() {
        cd.play();
    }
}
