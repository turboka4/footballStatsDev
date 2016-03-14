package testPackage.impl;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import testPackage.config.TestConfig;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class CdPlayerTest {

    @Rule
    public final StandardOutputStreamLog log =
            new StandardOutputStreamLog();

    @Autowired
    private CdPlayer player;

    @Test
    public void playerNotNull() {
        assertNotNull(player);
    }

    @Test
    public void testCorrectPlaying() {
        player.play();
        assertEquals("Playing Dude Ranch by Blink 182\r\n", log.getLog());
    }
}