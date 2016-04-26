package portal

import grails.transaction.Transactional

@Transactional
class MyRabbitService {

	// @com.bertram.rabbitmq.conf.Queue(name='rabbitTest', autoDelete=false, durable=true, exclusive=false, consumers=3, conAlias='main', autoStartup=true)
 //    def onRabbitTest(msg) {
 //    	println "Received Message: ${msg}"
 //    }

  //   def sendTest() {
		// sendRabbitMessage('main', 'rabbitTest', [text: 'hello there'])
  //   }
}
