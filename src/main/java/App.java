import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;



public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/index.vtl");

      return new ModelAndView(model, layout);
    }, 	new VelocityTemplateEngine());


    // get("/outputWP", (request, response) -> {
    //   Map<String,Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/outputWP.vtl");
    //
    //   String userInput = request.queryParams("userInput");
    //   // String userOutput = idk(userInput);
    //
    //   model.put("userInput", request.queryParams("userInput"));
    //   // model.put("userOutput", userOutput);
    //   return new ModelAndView(model, layout);
    // },	new VelocityTemplateEngine());
  }
}
