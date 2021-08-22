package com.eni.TP.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.eni.TP.bean.Category;
import com.eni.TP.bean.Superhero;
import com.eni.TP.service.HeroService; 

@RestController
//@RequestMapping("superhero")
public class HeroController {
	@Autowired
	HeroService heroService;

	@GetMapping("/creation")
	public ModelAndView creation() {
		ModelAndView mav=new ModelAndView("creation");
		mav.addObject("herocreation","creation d'un héro");
		return mav;
	}
	
	@GetMapping("/liste")
	public ModelAndView liste() {
		ModelAndView mav=new ModelAndView("liste");
		List<Category> categories = new  ArrayList<Category>();
		mav.addObject("categories","liste des héros");
		return mav;
	}
	
	@GetMapping("/detail")
	public ModelAndView detail() {
		ModelAndView mav=new ModelAndView("detail");
		mav.addObject("herodetail","detail de l'héros");
		return mav;
	}
	
	
	@PostMapping("/form")
	public ModelAndView form(@RequestParam("user_pseudoe")  String user_pseudoe,
			@RequestParam("user_nom")  String user_nom,
			@RequestParam("user_prenom")  String user_prenom,
			@RequestParam("categorie")  String categorie) {
		System.out.println(user_pseudoe + " " + user_nom+ "  "+user_prenom+ "  "+categorie);

		return liste();
	}
	
	
	@GetMapping("/formhero")
	public ModelAndView formhero() {
		ModelAndView mav = new ModelAndView("creation");
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category("Gentil"));
		categories.add(new Category("Méchant"));
		categories.add(new Category("Gentil/Méchant"));
		
		// mav.addObject("categories", Category.values()); // Avec Enum
		mav.addObject("categories", categories); 
		mav.addObject("heroFormular", new Superhero());
		return mav;
	} 
	
	@PostMapping("submit-superhero")
	public ModelAndView createUserFormMvc(@ModelAttribute("heroFormular") Superhero userForm) {
		// Traitement des données du formulaire
		heroService.createOrUpdate(userForm);
		// System.out.println("other"+userForm);
		
		return formhero();
	}
	
	
}
