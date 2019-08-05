package trymicronaut.controller

import io.micronaut.context.ApplicationContext
import io.micronaut.http.client.HttpClient
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.Specification

class HelloWorldControllerTest extends Specification {


    def "Greetings"() {

        when:
        EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer.class)
        HttpClient client = embeddedServer.getApplicationContext().createBean(HttpClient.class, embeddedServer.getURL())
        String response = client.toBlocking().retrieve("/greetings")

        then:
        "hello micronaut" == response
        embeddedServer.stop()



    }

    def "ReverseString"() {
        when:
        EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer.class)
        HttpClient client = embeddedServer.getApplicationContext().createBean(HttpClient.class, embeddedServer.getURL())
        String response = client.toBlocking().retrieve("/hello/thej")

        then:
        'jeht' == response
        embeddedServer.stop()
    }
}
