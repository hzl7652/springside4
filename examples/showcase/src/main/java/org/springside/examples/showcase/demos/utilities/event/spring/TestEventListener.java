package org.springside.examples.showcase.demos.utilities.event.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器.
 * @author hzl7652
 */
@Component
public class TestEventListener implements ApplicationListener<TestEvent> {

	private static Logger logger = LoggerFactory.getLogger(TestEventListener.class);

	@Override
	public void onApplicationEvent(TestEvent event) {
		logger.info("event message : {}", event.getMessage());
	}

}
