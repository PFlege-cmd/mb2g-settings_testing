package guru.springframework;

import org.junit.Test;
import guru.springframework.JavaHelloWorld;

public class JavaHelloWorldTest {

    @Test
    public void testHelloWorld(){

        var hello = new JavaHelloWorld();
        org.junit.Assert.assertEquals("Hello World", hello.getHello());
    }
}
