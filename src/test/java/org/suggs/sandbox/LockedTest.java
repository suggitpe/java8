package org.suggs.sandbox;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.suggs.sandbox.Locked.runInLock;

public class LockedTest {

    private static final Logger LOG = LoggerFactory.getLogger(LockedTest.class);

    @Test
    public void runLocked() {
        runInLock(() -> LOG.debug("This is locked"));
    }
}
