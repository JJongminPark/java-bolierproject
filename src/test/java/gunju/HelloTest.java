package gunju;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void testGetMessage() {
        // given
        Hello hello = new Hello();

        // when
        String message = hello.getMessage();

        // then
        Assert.assertEquals("Hello World", message);
    }
}