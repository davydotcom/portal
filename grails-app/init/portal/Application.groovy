package portal

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

// @EnableAutoConfiguration(exclude=RabbitAutoConfiguration.class)
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}