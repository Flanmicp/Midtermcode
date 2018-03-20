package com.cisc181.core;
import com.cisc181.core.Person;

public class PersonException extends Exception
{
	private Person peer;

	public PersonException(Person peer, String Message) 
	{
		super(Message);
		this.peer = peer;
		
	}
}
