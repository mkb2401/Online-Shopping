package net.mandeep.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		System.out.println("-----> Hi I am in controller");
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring Web MVC");
		return mv;
			}
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="greeting",required=false)String greet)
//		{
//		if(greet==null)
//			greet="Hello There";
//		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting",greet);
//		return mv;
//			}
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable(value="greeting",required=false)String greet)
		{	
		if(greet==null)
			greet="Hello There";
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greet);
		return mv;
			}
	
}
