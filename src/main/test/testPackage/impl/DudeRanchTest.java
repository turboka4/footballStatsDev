package testPackage.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import testPackage.CompactDisk;
import testPackage.config.TestConfig;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
public class DudeRanchTest {

    @Autowired
    private CompactDisk cd;

    @Test
    public void cdIsNotNull() {
        assertNotNull(cd);
    }
}