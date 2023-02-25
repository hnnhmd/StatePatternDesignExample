package com.fdmgroup.StateDesignPattenExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Han & Yew Seng
 * @version 23 Feb 2023
 * @since 23 Feb 2023
 */

/**
 * Person is the Context
 */
public class Person {
	/**
	 * The Person's feelings
	 */
	private Feelings currentState;
	Logger logger = LogManager.getLogger(Person.class);
	
	/**
	 * Person's default state is Happy
	 */
	public Person() {
		logger.trace("Creating person object who is by default, Happy.");
		currentState = new Happy();
	}
	
	/**
	 * Changes person's feeling to whatever is entered
	 * @param state
	 */
	public void setState (Feelings state) {
		logger.trace("Setting state of person object to class: " + state.getClass().toString());
		currentState = state;
	}
	
	/**
	 * Calls the current feeling of the person
	 */
	public void whatFeeling () {
		logger.trace("Calling the method feeling of the current state");
		this.currentState.feeling();
	}

}
