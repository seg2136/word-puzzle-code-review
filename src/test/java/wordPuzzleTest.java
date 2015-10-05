import org.junit.*;
import static org.junit.Assert.*;


public class WordPuzzleTest {

  @Test
  public void puzzle_changesVowels_true() {
    WordPuzzle wordpuzzle = new WordPuzzle();
    String result = "s-q----";
    assertEquals(result, WordPuzzle.puzzleMaker("sequoia"));
  }

  @Test
  public void puzzle_changesUppercaseVowels_true() {
    WordPuzzle wordpuzzle = new WordPuzzle();
    String result = "S-Q----";
    assertEquals(result, WordPuzzle.puzzleMaker("SEQUOIA"));
  }
}
