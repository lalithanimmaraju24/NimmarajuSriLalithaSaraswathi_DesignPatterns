package com.EPAM;

public class add implements Strategy{
	   @Override
	   public int doOp(int n1,int n2) {
	      return n1+n2;
	   }
	}