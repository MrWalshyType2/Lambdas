package com.qa.hello_world;

public class App implements Consumer {
	public static void main(String args[]) {
		Message messenger = new Message();

		messenger.operation("Fred says hi!", messenger.sayMessage);
	}
}