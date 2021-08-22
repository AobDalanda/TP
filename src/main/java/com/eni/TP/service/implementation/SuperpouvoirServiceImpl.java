package com.eni.TP.service.implementation;

import com.eni.TP.bean.Superpouvoir;
import com.eni.TP.dao.SuperpouvoirDAO;
import com.eni.TP.service.SuperpouvoirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class SuperpouvoirServiceImpl implements SuperpouvoirService {
    @Autowired
    SuperpouvoirDAO superpouvoirDAO;
    @Override
    @Transactional
    public Superpouvoir createOrUpdate(Superpouvoir superpouvoir) {
        return superpouvoirDAO.save(superpouvoir);
    }



    @Override
    @Transactional
    public void delete(int id) {

        superpouvoirDAO.deleteById(id);
    }

    @Override
    public Superpouvoir findById(int id) {

        return superpouvoirDAO.findById(id).get();
    }




    @Override
    public List<Superpouvoir> findAll() {
        return (List<Superpouvoir>) superpouvoirDAO.findAll();
    }

    @Override
    public void filter() {
        System.out.println("filter");
        System.out.println(superpouvoirDAO.findByName("FIRE"));
    }


}
