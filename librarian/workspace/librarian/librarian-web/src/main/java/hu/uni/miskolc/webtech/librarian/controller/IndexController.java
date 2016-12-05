package hu.uni.miskolc.webtech.librarian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value = { "", "/", "/home", "/index" })
	public ModelAndView homePage() {
		ModelAndView result = new ModelAndView("index");
		return result;
	}

	@RequestMapping(value = "/author")
	public ModelAndView autherPage() {
		ModelAndView mav = new ModelAndView("authorspage");
		return mav;
	}

	@RequestMapping(value = "/addauthors")
	public ModelAndView addAuther() {
		ModelAndView mav = new ModelAndView("addauthor");
		return mav;
	}

	@RequestMapping(value = "/updateauthors")
	public ModelAndView authorFormPage() {
		ModelAndView mav = new ModelAndView("updateauthor");
		return mav;
	}

	@RequestMapping(value = "/book")
	public ModelAndView bookPage() {
		ModelAndView mav = new ModelAndView("bookspage");
		return mav;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contactPage() {
		ModelAndView mav = new ModelAndView("contactpage");
		return mav;
	}
}
