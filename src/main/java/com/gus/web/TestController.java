package com.gus.web;

import com.gus.dao.TestEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @Autowired
    private TestEntityDao testEntityDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/testEntities", method = RequestMethod.GET)
    public String entities(Model model) {
        model.addAttribute("entityList", testEntityDao.findAll());
        return "entities";
    }
}
