package com.EPAM;

public abstract class Game {

	   abstract void initialize_Play();
	   abstract void start_Play();
	   abstract void end_Play();

	   public final void play(){
		   initialize_Play();
		   start_Play();
		   end_Play();
	   }
}
