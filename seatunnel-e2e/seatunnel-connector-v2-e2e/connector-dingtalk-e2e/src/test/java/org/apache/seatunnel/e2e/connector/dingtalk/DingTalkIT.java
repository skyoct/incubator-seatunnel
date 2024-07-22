package org.apache.seatunnel.e2e.connector.dingtalk;

import org.apache.seatunnel.e2e.common.TestResource;
import org.apache.seatunnel.e2e.common.TestSuiteBase;
import org.apache.seatunnel.e2e.common.container.TestContainer;
import org.junit.jupiter.api.*;
import org.testcontainers.containers.Container;

import java.io.IOException;

@Disabled("Disabled because it needs user's personal dingtalk access_token to run this test")
public class DingTalkIT extends TestSuiteBase implements TestResource {

    @BeforeEach
    @Override
    public void startUp() throws Exception {
    }

    @AfterEach
    @Override
    public void tearDown() throws Exception {
    }

    @TestTemplate
    public void testDingTalk(TestContainer container) throws IOException, InterruptedException {
        Container.ExecResult execResult = container.executeJob("/fakesource_to_dingtalk.conf");
        Assertions.assertEquals(0, execResult.getExitCode());
    }

}
