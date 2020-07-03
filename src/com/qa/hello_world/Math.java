package com.qa.hello_world;

public class Math implements Consumer {
	ConsumerMath addition = (int a, int b) -> a + b;
	
	public int operation(int num1, int num2, ConsumerMath operation) {
		return operation.doMath(num1, num2);
	}
}
