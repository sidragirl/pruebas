package com.car.mundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.car.mundo.personaje.domain.Personaje;
import com.car.mundo.personaje.service.impl.PersonajeService;
import com.car.mundo.usuario.dto.LoginDto;
import com.car.mundo.usuario.dto.SeleccionPersonajeDto;
import com.car.mundo.usuario.service.impl.UsuarioService;
import com.car.mundo.usuario.view.View;

@Controller
@RequestMapping("/user")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private PersonajeService personajeService;
	
	@RequestMapping(value = "/init", method = RequestMethod.GET)
	public ModelAndView initForm(){
		return new ModelAndView(View.LOGIN, "login", new LoginDto());
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("login") LoginDto loginDto){
 
		ModelAndView model;
		
		Integer resultado = usuarioService.login(loginDto);
		
		SeleccionPersonajeDto dto = new SeleccionPersonajeDto();
		if (resultado == 0) {
			List<Personaje> listaPersonajes = personajeService.listarPersonajesUsuario(loginDto.getUsuario());
			model = new ModelAndView(View.SELECCION_PERSONAJE);
			dto.setMensajeError("YUJUUUUUUU");
		} else {
			model = new ModelAndView(View.LOGIN);
			dto.setMensajeError("Usuario/Contraseña incorrectos");
		}
		
		model.addObject(dto);
 
		return model;
	}

}
