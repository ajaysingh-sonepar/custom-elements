package com.mulesoft.training;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleException;
import org.mule.api.lifecycle.Callable;
import org.mule.api.lifecycle.Startable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MuleLifecycleComponent implements Startable, Callable {
	
	private static final Logger logger = LogManager.getLogger("com.mulesoft.training.Logger");
	

	public Object onCall(MuleEventContext eventContext) throws Exception {
		logger.info("*******Component initiated oncall*******");
		return eventContext.getMessage();
	}

	public void start() throws MuleException {
		logger.info("*******Component initiated startup*******");
	}

}
