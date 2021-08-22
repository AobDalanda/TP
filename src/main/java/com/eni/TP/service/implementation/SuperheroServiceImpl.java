package com.eni.TP.service.implementation;

import java.util.List;

import com.eni.TP.dao.SuperpouvoirDAO;
import com.eni.TP.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eni.TP.bean.Superhero;
@Service
public class SuperheroServiceImpl implements HeroService {



	@Override
	public Superhero createOrUpdate(Superhero superhero) {
		// TODO Auto-generated method stub
		System.out.println("Creation et update");
		System.out.println("implementation "+superhero);
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Superhero findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Superhero> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
