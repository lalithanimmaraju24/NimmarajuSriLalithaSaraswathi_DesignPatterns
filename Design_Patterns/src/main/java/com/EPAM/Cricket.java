package com.EPAM;
public class Cricket extends Game {

	   @Override
	   void end_Play() {
	      System.out.println("Cricket Game Finished!");
	   }

	   @Override
	   void initialize_Play() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   @Override
	   void start_Play() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}