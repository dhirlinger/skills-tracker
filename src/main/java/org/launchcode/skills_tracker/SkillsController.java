package org.launchcode.skills_tracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String skillsTracker(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<l1>Java</li>" +
                "<l1>JavaScript</li>" +
                "<l1>Python</li>" +
                "</ol>" +
                "</body>" +
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        return "<html>" +
                "<body>" +
                "<form action='' method='post'>" +

                "<label for='name'>Name: </label>" +
                "<input type='text' name='name'>" +

                "<label for='favorite'>My Favorite Language: </label>" +
                "<select name='favorite'>" +
                "<option value='jv'>Java</option>" +
                "<option value='js'>JavaScript</option>" +
                "<option value='py'>Python</option>" +
                "</select>" +

                "<label for='secondFavorite'>My Second Favorite Language: </label>" +
                "<select name='favorite'>" +
                "<option value='jv'>Java</option>" +
                "<option value='js'>JavaScript</option>" +
                "<option value='py'>Python</option>" +
                "</select>" +

                "<label for='thirdFavorite'>My Third Favorite Language: </label>" +
                "<select name='favorite'>" +
                "<option value='jv'>Java</option>" +
                "<option value='js'>JavaScript</option>" +
                "<option value='py'>Python</option>" +
                "</select>" +

                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String favoriteSkills(@RequestParam String name, String favorite, String secondFavorite, String thirdFavorite ){
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
     }
}
