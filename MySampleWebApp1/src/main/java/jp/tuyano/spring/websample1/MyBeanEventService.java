package jp.tuyano.spring.websample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyBeanEventService implements ApplicationEventPublisherAware {

	@Autowired
	private MyBean mybean;
	// ApplicationEvent を発行する為の機能を提供
	private ApplicationEventPublisher publisher;
	
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
		System.out.println("setApplicationEventPublisher");
	}
	
	public void doService(String message) {
		System.out.println("doService!");
		mybean.addMessage(message);
		publisher.publishEvent(new MyBeanEvent(this));
	}
}
