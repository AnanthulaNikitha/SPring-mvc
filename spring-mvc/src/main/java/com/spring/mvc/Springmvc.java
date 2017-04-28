package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Springmvc {
	
	
	
	
	
	
	 @RequestMapping(value="/",method = RequestMethod.GET)
	 
	    public String get()
	 {
	        return "index";
	    }

	    @RequestMapping(value= "Greeting", method = RequestMethod.GET)
	    public String getPage( Model model) {
	    	
	    	model.addAttribute("msg","welcome to spring");
	        return "welcome";
	    }


}
