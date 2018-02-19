package younus.attari.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {

	@RequestMapping(value="/one")
	public String defaultRequest(){
		System.out.println("from default / request...");
		return "redirect:/home";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginDetails(){
		System.out.println("this is from login post...");
		return "redirect:/login";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String defaultReq(){
		System.out.println("this is from login post...");
		return "redirect:/login";
	}
}
