package org.lanwei.morning.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lanwei 2018-03-20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class MorningBaseSpringTest {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void test() {
        System.out.println("&&&&&&&&&&&&&&&&&&&&");
        logger.info("&&&&&&&&&&&&&&&&&&&&");
    }
}
