package org.springside.examples.showcase.demos.utilities.event.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 测试事件对象.
 * 
 * @author hzl7652
 */
public class TestEvent extends ApplicationEvent {

	private static final long serialVersionUID = -388369952839353286L;

	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
