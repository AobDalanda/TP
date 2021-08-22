package com.eni.TP.dao;


import com.eni.TP.bean.Superpouvoir;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SuperpouvoirDAO extends CrudRepository<Superpouvoir, Integer> {

    List<Superpouvoir> findByName(String name);

}
