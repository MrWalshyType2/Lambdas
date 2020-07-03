package com.qa.hello_world;

public class Message implements Consumer {
	ConsumerMessage sayMessage = (String str) -> System.out.println(str);
	ConsumerMessage greet = (String name) -> System.out.println("Hello " + name);
	
	public void operation(String str, ConsumerMessage operation) {
		operation.sayMessage(str);
	}
}
