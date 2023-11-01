package com.odnt.thisisart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("art")
public class ArtController {

    //request at /welcome
//    @GetMapping("welcome")
//    @ResponseBody
//    public String helloArt() {
//        return "Welcome to 'This is Art'";
//    }

    //lives at /art/thanks
    @GetMapping("thanks")
    public String thanksArt() {
        return "Thanks for visiting 'This is Art'";
    }


    //lives at /art/welcome
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String welcomeWithQueryParam(@RequestParam String name) {
        return "Welcome to Your website " + name + "!";
    }

    //handles requests of the form /welcome/Charlie
    @GetMapping("{name}")
    public String welcomeWithPathParam(@PathVariable String name){
        return "Welcome to Your website " + name + "!";
    }

    @GetMapping("form")
    public String welcomeForm() {
        return "<html>" +
                "<body>" +
                "<form action='welcome' method='post'>" +//submit a request to /welcome
                "<input type='text' name='name'>" +
                "<input type='submit' value='Welcome'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }



}
