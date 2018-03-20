package org.lanwei.morning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanwei.morning.test.TestApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lanwei 2018-03-20
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public class MorningBaseSpringTest {


    @Test
    private void test() {
        System.out.println("&&&&&&&&&&&&&&&&&&&&");
    }
}
