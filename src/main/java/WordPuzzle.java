import.java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public class WordPuzzle {
	public static void main(String[] args) {
		String layout = "templates/layout.vtl";

		get("/inputWP", (request, response) -> {
			HashMap model = new HashMap();
			model.put("template", "templates/inputWP.vtl");

			return new ModelAndView(model, layout);
		}, 	new VelocityTemplateEngine());


		get("/outputWP", (request, response) -> {
			Map<String,Object> model = new HashMap<String, Object>();
			model.put("template", "templates/outputWP.vtl");

			String userInput = request.queryParams("userInput");
			// String userOutput = idk(userInput);

			model.put("userInput", request.queryParams("userInput"));
			// model.put("userOutput", userOutput);
			return new ModelAndView(model, layout); 
		},	new VelocityTemplateEngine());
	}
}

public class vowelReplacer {
	public static String getPuzzleWord(String word){
		
		HashMap<Character, String> vowels = new HashMap<Character, String>();

		vowelReplace.put('a', "-");
		vowelReplace.put('e', "-");
		vowelReplace.put('i', "-");
		vowelReplace.put('o', "-");
		vowelReplace.put('u', "-");

		// char[] wordChars = word.toCharArray();
		// String str2 = word(userInput);
		// String[] str1Array = str2.split(wordChars);
		// for (char letter : wordChars) {
		// 	String noVowelWord = vowelReplace.get(letter);
		}
	}	
}

