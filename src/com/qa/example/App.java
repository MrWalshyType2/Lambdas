package com.qa.example;

public class App {

    public static void main(String[] args) {   
        App APP = new App();
          //with type declaration
          MathOperation addition = (int a, int b) -> a + b;
            
          //with out type declaration
          MathOperation subtraction = (a, b) -> a - b;
            
          //with return statement along with curly braces
          MathOperation multiplication = (int a, int b) -> { return a * b; };
            
          //without return statement and without curly braces
          MathOperation division = (int a, int b) -> a / b;
            
          System.out.println("10 + 5 = " + APP.operate(10, 5, addition));
          System.out.println("10 - 5 = " + APP.operate(10, 5, subtraction));
          System.out.println("10 x 5 = " + APP.operate(10, 5, multiplication));
          System.out.println("10 / 5 = " + APP.operate(10, 5, division));
            
          //without parenthesis
          GreetingService greetService1 = message ->
          System.out.println("Hello " + message);
            
          //with parenthesis
          GreetingService greetService2 = (message) ->
          System.out.println("Hello " + message);
          
          GreetingService greetService3 = (message) ->
          System.out.println("Hello " + message);
            
          greetService1.sayMessage("Vin");
          greetService2.sayMessage("Alan");
          greetService3.sayMessage("Morgan");
          
          GoodbyeService goodbyeService1 = (message) ->
          System.out.println("Goodbye " + message);
          
          goodbyeService1.sayMessage("Fred");
          goodbyeService1.sayMessage("Bob");
       }
        
       interface MathOperation {
          int operation(int a, int b);
       }
        
       interface GreetingService {
          void sayMessage(String message);
       }
       
       interface GoodbyeService {
    	   void sayMessage(String message);
       }
        
       private int operate(int a, int b, MathOperation mathOperation) {
          return mathOperation.operation(a, b);
       }
    }