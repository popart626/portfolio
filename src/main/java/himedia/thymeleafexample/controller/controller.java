package himedia.thymeleafexample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import himedia.thymeleafexample.domain.Item;

@Controller
public class controller {
	
	@GetMapping("/first")
	String first(Model model) {
		model.addAttribute("test", "why?");
		model.addAttribute("num", 10);
		return "ex_01";
	}
	
	@GetMapping("/second")
	ModelAndView second() {
		ModelAndView mav = new ModelAndView("ex_02");
		mav.addObject("test", "WHY?");
		return mav;
	}
	
	@GetMapping("/third")
	ModelAndView third() {
		ModelAndView mav = new ModelAndView("ex_03");
		List<Item> items = Arrays.asList(
				new Item(1L,"testA",1000,1),
				new Item(2L,"testB",2000,2),
				new Item(3L,"testC",3000,3)
				);
		mav.addObject("items",items);
		
		return mav;
		
	}
	
	@GetMapping("/fourth")
	ModelAndView fourth() {
		ModelAndView mav = new ModelAndView("ex_04");
		mav.addObject("element","<p>추가된 엘리먼트</p>");
		return mav;
	}
	
}
