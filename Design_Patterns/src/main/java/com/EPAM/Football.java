package com.EPAM;

public class Football extends Game {

	   @Override
	   void end_Play() {
	      System.out.println("Football Game Finished!");
	   }

	   @Override
	   void initialize_Play() {
	      System.out.println("Football Game Initialized! Start playing.");
	   }

	   @Override
	   void start_Play() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}