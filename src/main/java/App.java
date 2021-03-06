import java.util.HashMap;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, 	new VelocityTemplateEngine());


    get("/output", (request, response) -> {
      HashMap<String,Object> model = new HashMap<String, Object>();
      model.put("template", "templates/outputWP.vtl");
      String userInput = request.queryParams("userInput");
      String userOutput = WordPuzzle.puzzleMaker(userInput);
      model.put("userOutput", userOutput);

      return new ModelAndView(model, layout);
      },	new VelocityTemplateEngine());
  }
}
