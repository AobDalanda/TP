package com.eni.TP.service;

import com.eni.TP.bean.Category;
import com.eni.TP.bean.Superhero;

import java.util.List;

public interface CategoryService {

    public Category createOrUpdate(Category category);
    public void delete(int id);
    public Category findById(int id);
    public List<Category> findAll();
}
