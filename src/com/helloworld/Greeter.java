package com.helloworld;

public interface Greeter {
	void setName(String name); // name of the author
	String getGreeting();
}

class AuthorGreeter implements Greeter {
	private String name;


	public void setName (String name)	// name of the author
	{ 
		this.name = name;
	}

	public String getGreeting()
	{
		return "Hello world from " + name + "!";
	}
}
