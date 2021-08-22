package com.eni.TP.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.eni.TP.bean.Superpouvoir;
import com.eni.TP.service.SuperpouvoirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SuperpouvoirController {
    @Autowired
    SuperpouvoirService superpouvoirService;

    @GetMapping("/")
    public ModelAndView accueil() {
        ModelAndView mav = new ModelAndView("home");
        superpouvoirService.filter();
        return mav;
    }

    @GetMapping("/formpower")
    public ModelAndView power() {
        ModelAndView mav = new ModelAndView("superpower");
        System.out.println(superpouvoirService.findAll());
        mav.addObject("powerFormular", new Superpouvoir());
        mav.addObject("listepower", superpouvoirService.findAll());
        return mav;
    }

    @PostMapping("submit-superpower")
    public ModelAndView createSuperPower(@ModelAttribute("superpower") Superpouvoir powerform) {
        superpouvoirService.createOrUpdate(powerform);
        return power();
    }


    @PostMapping("delete-superpower")
    public ModelAndView deleteSuperPower(int id) {
        superpouvoirService.delete(id);
        return power();
    }


}
