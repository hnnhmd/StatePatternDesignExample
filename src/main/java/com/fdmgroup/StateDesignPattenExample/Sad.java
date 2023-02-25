package com.fdmgroup.StateDesignPattenExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Han & Yew Seng
 * @version 23 Feb 2023
 * @since 23 Feb 2023
 */

/**
 * Sad is a concrete state
 */
public class Sad implements Feelings {
	Logger logger = LogManager.getLogger(Sad.class);

	/**
	 * Is called by Person's 'what feeling method' if the Person's state is Sad
	 * {@inheritDoc}
	 */
	@Override
	public void feeling() {
		// TODO Auto-generated method stub
		logger.trace("Within Sad Class, calling method to output that child is sad");
		System.out.println("Person is feeling sad :(");
		
	}
}


