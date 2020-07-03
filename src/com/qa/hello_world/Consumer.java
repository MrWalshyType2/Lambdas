package com.qa.hello_world;

public interface Consumer {

	interface ConsumerMessage {
		void sayMessage(String message);
	}

	interface ConsumerMath {
		int doMath(int num1, int num2);
	}
}
