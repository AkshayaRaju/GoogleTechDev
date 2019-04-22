package main.java.constants;

/**
 * @author Akshaya
 * ApplicationConstants contains all commonly used String constants.
 *
 */
public abstract class ApplicationConstants{
	public static final String WELCOME_MESSAGE = "Welcome to Hangman!\n";
	public static final String WORD_MESSAGE = "The word now looks like this: %s\n";
	public static final String GUESS_LEFT_MESSAGE = "You have %d guesses left.\n";
	public static final String GUESS_MESSAGE = "Your guess:";
	public static final String ILLEGAL_GUESS = "Oops! Your guess is illegal. Guess again!\n";
	public static final String ABSENT_MESSAGE = "There are no %c's in the word.\n";
	public static final String PRESENT_MESSAGE = "That guess is correct.\n";
	public static final String LOSE_MESSAGE = "You are completely hung.\nThe word was %s.\nYou lose.";
	public static final String WIN_MESSAGE = "You guessed the word: %s.\n You win!";
}