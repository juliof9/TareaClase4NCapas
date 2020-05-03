package com.uca.Tarea4ClaseNCapas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.Tarea4ClaseNCapas.domain.Producto;

@Controller
public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("views/index");
		return mav;
	}

	
	@RequestMapping("/procesar2")
	public ModelAndView procesar2(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) 
			mav.setViewName("views/index");
		else {
			mav.addObject("product", producto.getNombre());
			mav.setViewName("views/resultado");
		}
		return mav;
	}

}
