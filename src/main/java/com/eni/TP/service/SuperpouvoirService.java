package com.eni.TP.service;

import com.eni.TP.bean.Category;
import com.eni.TP.bean.Superpouvoir;

import java.util.List;

public interface SuperpouvoirService {
    public Superpouvoir createOrUpdate(Superpouvoir superpouvoir);
    public void delete(int id);
    public Superpouvoir findById(int id);
    public List<Superpouvoir> findAll();
    public void filter();

}
