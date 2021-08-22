package com.eni.TP.data;

import com.eni.TP.bean.Superpouvoir;
import com.eni.TP.dao.SuperpouvoirDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class FixtureData {
    @Autowired
    private SuperpouvoirDAO superpouvoirDAO;
    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        superpouvoirDAO.save(new Superpouvoir("FIRE", "feu interminable",150));
        superpouvoirDAO.save(new Superpouvoir("Water", "eteindre le feu des adversaires",50));
        superpouvoirDAO.save(new Superpouvoir("Air", "le pouvoir de l'air ",200));
        superpouvoirDAO.save(new Superpouvoir("Wartank", "le char dans la main",550));
    }
}
