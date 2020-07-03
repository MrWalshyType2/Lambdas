package com.qa.hello_world;

public class Message implements Consumer {
	ConsumerOperation sayMessage = (String str) -> System.out.println(str);
	
	public void operation(String str, ConsumerOperation operation) {
		operation.sayMessage(str);
	}
}
