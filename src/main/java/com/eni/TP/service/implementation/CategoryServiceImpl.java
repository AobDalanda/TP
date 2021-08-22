package com.eni.TP.service.implementation;

import com.eni.TP.bean.Category;
import com.eni.TP.dao.CategoryDAO;
import com.eni.TP.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
     @Autowired
    CategoryDAO categoryDAO;
    @Override
    public Category createOrUpdate(Category category) {
        //categoryDAO.save(category);
        return  categoryDAO.save(category);
    }

    @Override
    public void delete(int id) {
        categoryDAO.deleteById(id);
    }

    @Override
    public Category findById(int id) {
       Optional<Category> mycategorie= categoryDAO.findById(id);
        return null;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }
}
