package com.fdmgroup.StateDesignPattenExample;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		//default state is sad
		person1.whatFeeling();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//alter state
		person1.setState(new Sad());
		
		
		
		//calling same method of Person but different output
		person1.whatFeeling();
}
}