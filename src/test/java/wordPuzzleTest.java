import org.junit.*;
import static org.junit.Assert.*;


public class WordPuzzleTest {

  @Test
  public void puzzle_changeVowels_true(){
    WordPuzzle wordpuzzle = new WordPuzzle();
    String result = "s-q----";
    assertEquals(result, WordPuzzle.puzzleMaker("sequoia"));
  }
}
