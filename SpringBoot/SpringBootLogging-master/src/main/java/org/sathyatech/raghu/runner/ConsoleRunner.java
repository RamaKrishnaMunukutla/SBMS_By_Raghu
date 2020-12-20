package org.sathyatech.raghu.runner;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {

	//#1 SLF4j
	//private static Logger log=LoggerFactory.getLogger(ConsoleRunner.class);
	//#2 Apache Log4J
	private static Logger log=LogManager.getLogger(ConsoleRunner.class);
	//#3 Java Util Logging
	//private static Logger log=Logger.getLogger(ConsoleRunner.class.getName());
	
	
	@Override
	public void run(String... args) throws Exception {

		log.debug("--Hello--D--");
		log.info("--Hello--I--");
		log.warn("--Hello--W--");
		log.error("--Hello--E--");
	}

}
