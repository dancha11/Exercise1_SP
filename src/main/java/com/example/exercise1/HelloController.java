package com.example.exercise1;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/hello")
    public String getUserFeedback(@RequestParam Map<String,String> requestParams) throws Exception{
        String location=requestParams.get("location");
        String name=requestParams.get("name");

        return "Welcome to the " + location + " " + name + "!";      
    }
	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
		}
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
		}
}