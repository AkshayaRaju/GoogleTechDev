package main.java.application;

import main.java.entities.HangmanLexicon;

import java.util.Random;
import java.util.Scanner;

import main.java.constants.ApplicationConstants;

/**
 * @author Akshaya
 * HangmanApplication contains members that simulates a hangman game.
 *
 */
public abstract class HangmanApplication{
	
	private static HangmanLexicon wordsList;
	private int guessCount;
	private Scanner scanner;

	public HangmanApplication(){
		wordsList = new HangmanLexicon();
		guessCount = 8;
		scanner = new Scanner(System.in);
	}

	private void displayMessage(String message){
		System.out.print(message);
	}
	
	private boolean validateInput(String input){
		return (input.length()==1 && (Character.isAlphabetic(input.charAt(0))));
	}
	
	/*Further improvements:
	 * 1. Add try-catch block
	 * 2. Segregate into smaller functions
	 */
	public void run(){
		displayMessage(ApplicationConstants.WELCOME_MESSAGE);
		String word = wordsList.getWord(new Random().nextInt(wordsList.getWordCount()));
		char temp[]=new char[word.length()];
		for(int i=0;i<word.length();i++){
			temp[i]='-';
		}
		String input = null;
		char ch;
		int index=0;
		boolean win=false;
		while(guessCount>0){
			displayMessage(String.format(ApplicationConstants.WORD_MESSAGE,String.valueOf(temp)));
			displayMessage(String.format(ApplicationConstants.GUESS_LEFT_MESSAGE,guessCount));
			displayMessage(ApplicationConstants.GUESS_MESSAGE);
			input = scanner.nextLine();
			if(!validateInput(input)){
				displayMessage(ApplicationConstants.ILLEGAL_GUESS);
			}else{
				ch=Character.toUpperCase(input.charAt(0));
				index = word.indexOf(String.valueOf(ch));
				if(index==-1){
					displayMessage(String.format(ApplicationConstants.ABSENT_MESSAGE,ch));
				}else{
					displayMessage(ApplicationConstants.PRESENT_MESSAGE);
					if(temp[index]==ch){continue;}
					for(;index>=0;index=word.indexOf(ch,index+1)){
						temp[index]=ch;
					}
					if(word.equalsIgnoreCase(String.valueOf(temp))){win=true; break;}
				}
				guessCount--;
			}
		}
		if(!win){
			displayMessage(String.format(ApplicationConstants.LOSE_MESSAGE,word));
		}else{
			displayMessage(String.format(ApplicationConstants.WIN_MESSAGE, word));
		}
	}
	
}