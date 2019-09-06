package com.trnet.controller;

import com.trnet.model.Event;
import com.trnet.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by root on 7/9/17.
 */
@Controller
public class Helloworld {

    @Autowired
    IEventService eventService;


    @RequestMapping(value = "/firstPage", method = RequestMethod.GET)
    public String test(ModelMap mm) {
        String a="davarsss";
        String bcd="denemes2222sssss33333343434s";
        long l = System.currentTimeMillis();
        List<Event> contacts = eventService.contactList();
        mm.addAttribute("test",a);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
        return "davar";



    }


    @RequestMapping(value = "/test",method = RequestMethod.GET)

    public  @ResponseBody List<Event> allList(){
        List<Event> contacts = eventService.contactList();
        return contacts;
    }
}
