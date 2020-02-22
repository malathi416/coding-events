package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        HashMap<String, String> events = new HashMap<>();
        events.put("Strange Loop","Meeting");
        events.put("Code with Pride","Conference");
        events.put("LC 101 Graduation","Party");
        model.addAttribute("events",events);
        return "events/index";
    }

    //lives at /events/create
//    @GetMapping("create")
//    public String renderCreateEventForm(Model model){
//        model.addAttribute("title", "Create Event");
//        return "events/create";
//    }
//
//    @PostMapping("create")
//    public String processCreateEventForm(@RequestParam String eventName,@RequestParam String description){
//        events.put(eventName,description);
//        return "redirect:";
//    }



}
