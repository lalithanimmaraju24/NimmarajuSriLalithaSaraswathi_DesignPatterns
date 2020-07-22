package com.EPAM;

public class FruitFactory {

	   public Fruit getFruit(String fruitType){
	      if(fruitType == null){
	         return null;
	      }		
	      if(fruitType.equalsIgnoreCase("apple")){
	         return new Apple();
	         
	      } else if(fruitType.equalsIgnoreCase("banana")){
	         return new Banana();
	         
	      } else if(fruitType.equalsIgnoreCase("mango")){
	         return new Mango();
	      }
	      
	      return null;
	   }
	}