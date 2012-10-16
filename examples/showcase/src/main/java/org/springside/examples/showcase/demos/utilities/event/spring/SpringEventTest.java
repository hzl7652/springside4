package org.springside.examples.showcase.demos.utilities.event.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.log.Log4jMockAppender;
import org.springside.modules.test.spring.SpringContextTestCase;
import org.springside.modules.utils.Threads;

/**
 * Spring applicationContext event test.
 * @author hzl7652
 */
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class SpringEventTest extends SpringContextTestCase {

	@Test
	public void testSpringEvent() {
		//插入appender用于assert。
		Log4jMockAppender appender = new Log4jMockAppender();
		appender.addToLogger(TestEventListener.class);

		TestEvent event = new TestEvent(this, "event content");
		applicationContext.publishEvent(event);
		Threads.sleep(1000);
		assertFalse(appender.isEmpty());
	}
}
