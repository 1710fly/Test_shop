package com.fly.shop.manager.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Mis.Fu on 2018/4/17.
 */
@Controller
public class ManagerIndexAction {
    @RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public String index(@PathVariable String page){
        return page;
    }

}
