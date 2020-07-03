package com.qa.hello_world;

public class App {
	interface SayHello {
		void sayMessage();
	}

	public static void main(String args[]) {
		Message messenger = new Message();
		Math calculator = new Math();

		messenger.operation("Fred says hi!", messenger.sayMessage);
		messenger.operation("Bob says hi", messenger.sayMessage);
		messenger.operation("Bob", messenger.greet);

		System.out.println(calculator.operation(10, 10, calculator.addition));

		///////////////////////////////////////////////////
		// Anonymous inner interface //
		///////////////////////////////////////////////////
		SayHello i = new SayHello() { // DO NOT DO THIS
			// DO NOT DO THIS
			@Override // DO NOT DO THIS
			public void sayMessage() {// DO NOT DO THIS
				// TODO Auto-generated method stub// DO NOT DO THIS
				// DO NOT DO THIS
			}// DO NOT DO THIS
		};

		SayHello h;
		h = () -> {
			System.out.println("Hello");
		};

		h.sayMessage();

		// Best practice
		Consumer.ConsumerMath addition = (num1, num2) -> {
			return num1 + num2;
		};
		Consumer.ConsumerMath subtraction = (num1, num2) -> {
			return num1 - num2;
		};
		Consumer.ConsumerMath multiplication = (num1, num2) -> {
			return num1 * num2;
		};
		Consumer.ConsumerMath division = (num1, num2) -> {
			return num1 / num2;
		};
		System.out.println(addition.doMath(20, 20));
		System.out.println(subtraction.doMath(20, 10));

		Consumer.ConsumerMessage publicServiceAnnouncement1 = (message) -> {
			System.out.println(message);
		};
		String message = "This is a public service announcement!";
		publicServiceAnnouncement1.sayMessage(message);
	}
}