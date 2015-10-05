import org.junit.*;
import static org.junit.Assert.*;


public class WordPuzzleTest {

  @Test
  public void puzzle_changeVowels_true() {
    WordPuzzle wordpuzzle = new WordPuzzle();
    String result = "s-q----";
    assertEquals(result, WordPuzzle.puzzleMaker("sequoia"));
  }

  @Test
  public void puzzle_doesNotAcceptNumbers_true(){
    WordPuzzle wordpuzzle = new WordPuzzle();
    String result = "I'm sorry, you can only use letters for this game. Please try again.";
    assertEquals(result, WordPuzzle.puzzleMaker("4567"));
  }
}
