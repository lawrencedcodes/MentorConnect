package com.topsoutherncoders.MentorConnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MentorController {

        @RequestMapping()
        @ResponseBody
        public String startSkills () {
            String html = "<h1>Mentor Connect</h1>" +
                    "<h2>Fill out our 5 minute form to be connected!</h2>" +
                    "<ul>" +
                    "<li>Mentor</li>" +
                    "<li>Mentee</li>" +
                    "<li>PM</li>" +
                    "</ul>" +
                    "<a href = '/form'>Click here to Enter</a>";

            return html;
        }

        @GetMapping(value="form")
        @ResponseBody
        public String formSkills() {
            String html = "<form method='post'>" +
                    "My Name:<br>" +
                    "<input type = 'text' name = 'name' />" +
                    "My role:</br>" +
                    "<select name= 'role'>" +
                    "<option value= 'mentor'>Mentor</option>" +
                    "<option value= 'mentee'>Mentee</option>" +
                    "<option value= 'pm'>Project Manager</option>" +
                    "</select>" +
                    "<br>Where I need / want help: <br>" +
                    "<select name = 'firstChoice'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                    "</select>" +
                    "<br>My second favorite language:<br>" +
                    "<select name = 'secondChoice'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                    "</select>" +
                    "<br>My third favorite language:<br>" +
                    "<select name = 'thirdChoice'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'Javascript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                    "</select><br>" +
                    "<input type = 'submit' value = 'Submit' />" +
                    "</form>";

            return html;
        }

        @PostMapping(value="form")
        @ResponseBody
        public String namePage(@RequestParam String role, @RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
            String html = "<center><h1>" + name + "</h1>" +
                    "<h2> We're excited to welcome you on as a " + role + "</h2>" +
                    "<h4> We'll do our best to pair you with someone regarding " + firstChoice + "</h4>" +
                    "<h4> however we apprecitae you being open to " + secondChoice + " and " + thirdChoice + "</center>";
                    ;
            return html;
        }
    }
