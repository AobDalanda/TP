package com.eni.TP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eni.TP.bean.Superhero;

@RestController
public class FormController {

	
	/*
	@GetMapping("/formhero")
	public ModelAndView formhero() {
		ModelAndView mav = new ModelAndView("formhero");
		mav.addObject("heroFormular", new Superhero());
		return mav;
	} 
	
	@PostMapping("heroForm")
	public ModelAndView createUserFormMvc(@ModelAttribute("heroFormular") Superhero userForm) {
		// Traitement des données du formulaire
		System.out.println(userForm);
		
		return formhero();
	}
	
	*/
}
