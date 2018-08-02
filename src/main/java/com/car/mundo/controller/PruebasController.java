package com.car.mundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.car.mundo.login.dto.PruebasDto;

@Controller
@RequestMapping("/welcome")
public class PruebasController{
 
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView helloWorld(){
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		
		PruebasDto dto = new PruebasDto();
		dto.setPruebas("aaa");
		//model.addObject("mensaje", "hello world");
		model.addObject(dto);
 
		return model;
	}
}