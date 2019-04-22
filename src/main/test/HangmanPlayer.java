package main.test;

import main.java.application.HangmanApplication;

/**
 * @author Akshaya
 * The player class initiates the Hangman application.
 *
 */
public class HangmanPlayer extends HangmanApplication{
	
	public void playHangman(){
		run();
	}
	
	public static void main(String args[]){
		new HangmanPlayer().playHangman();
	}

}
