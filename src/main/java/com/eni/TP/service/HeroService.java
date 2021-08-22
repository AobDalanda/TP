package com.eni.TP.service;

import java.util.List;

import com.eni.TP.bean.Superhero;

public interface HeroService {
	
	public Superhero createOrUpdate(Superhero superhero);
	public void delete(int id);
	public Superhero findById(int id);
	public List<Superhero> findAll();

}
