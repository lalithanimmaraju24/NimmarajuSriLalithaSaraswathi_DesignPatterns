package com.EPAM;

public class Context {
	   private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int strategy_Execute(int n1,int n2){
	      return strategy.doOp(n1, n2);
	   }
	}