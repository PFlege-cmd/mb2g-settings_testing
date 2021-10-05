package guru.springframework.groovy

import spock.lang.Specification

class JavaHelloWorldTest extends Specification {

    def "getHello"(){
        when:
        def foo = 123;

        then:
        println "Je te vois";
        true;
    }

}
