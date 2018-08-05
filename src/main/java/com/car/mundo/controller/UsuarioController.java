package com.car.mundo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.car.mundo.usuario.dto.LoginDto;
import com.car.mundo.usuario.dto.PruebasDto;
import com.car.mundo.usuario.service.impl.UsuarioService;

@Controller
@RequestMapping("/user")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(){
 
		ModelAndView model = new ModelAndView("HelloWorldPage");
		
//		PruebasDto dto = new PruebasDto();
//		dto.setPruebas("aaa");
//		//model.addObject("mensaje", "hello world");
//		model.addObject(dto);
		
		LoginDto pruebas = new LoginDto();
		pruebas.setPassword("elputoamo");
		pruebas.setUsuario("master");
		
		Integer resultado = usuarioService.login(pruebas);
		
		PruebasDto dto = new PruebasDto();
		if (resultado == 0) {
			dto.setPruebas("login ok");
		} else {
			dto.setPruebas("login ko");
		}
		//model.addObject("mensaje", "hello world");
		model.addObject(dto);
 
		return model;
	}

}
