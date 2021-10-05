import guru.springframework.JavaHelloWorld;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
public class JUnit5FauxTest {

    @Test
    public void fauxTest(){

        var hello = new JavaHelloWorld();

        Assertions.assertEquals("Hello World", hello.getHello());


    }
}
