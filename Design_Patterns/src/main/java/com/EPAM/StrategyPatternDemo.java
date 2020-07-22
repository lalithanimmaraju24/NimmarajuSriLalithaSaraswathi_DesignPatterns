package com.EPAM;

public class StrategyPatternDemo {
	   public static void main(String[] args) {
	      Context context = new Context(new add());		
	      System.out.println("10+5=" + context.strategy_Execute(10, 5));

	      context = new Context(new sub());		
	      System.out.println("10-5=" + context.strategy_Execute(10, 5));

	      context = new Context(new mul());		
	      System.out.println("10*5=" + context.strategy_Execute(10, 5));
	   }
	}
