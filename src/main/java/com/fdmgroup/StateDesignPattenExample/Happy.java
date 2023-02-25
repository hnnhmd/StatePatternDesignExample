package com.fdmgroup.StateDesignPattenExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author Han & Yew Seng
 * @version 23 Feb 2023
 * @since 23 Feb 2023
 */

/**
 * Happy is a concrete state
 */
public class Happy implements Feelings{
	Logger logger = LogManager.getLogger(Happy.class);

	/**
	 * Is called by Person's 'what feeling method' if the Person's state is Happy
	 * {@inheritDoc}
	 */
	@Override
	public void feeling() {
		// TODO Auto-generated method stub
		logger.trace("Within Happy Class, calling method to output that child is happy");
		System.out.println("Person is feeling happy :)");
	}
}
