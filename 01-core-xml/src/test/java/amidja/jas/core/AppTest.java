package amidja.jas.core;

import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest {
	
	@Rule public TestName name = new TestName();
	
	final Logger logger = LoggerFactory.getLogger(AppTest.class);
	
	@Test
	public void testA() {
		logger.info("{} being run...", name.getMethodName());
		fail("Not yet implemented");
	}

	@Test
	public void testB() {
		logger.info("{} being run...", name.getMethodName());
		fail("Not yet implemented");
	}
}
