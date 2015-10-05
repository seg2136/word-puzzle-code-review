import java.io.Console;

public class WordPuzzle {
	public static void main(String[] args) {
		Console console = System.console();
	}

	public static String puzzleMaker(String userInput) {
		String result = userInput.replaceAll("[aeiouyAEIOUY]", "-");

		return result;
	}
}
