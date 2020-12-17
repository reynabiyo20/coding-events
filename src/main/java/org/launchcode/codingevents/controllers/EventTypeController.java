package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventTypeRepository;
import org.launchcode.codingevents.models.EventType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("eventTypes")
public class EventTypeController {

    @Autowired
    private EventTypeRepository eventTypeRepository;

    @GetMapping
    public String displayAllTypes(Model model) {
        model.addAttribute("title", "All Types");
        model.addAttribute("types", eventTypeRepository.findAll());
        return "eventTypes/index";
    }

    @GetMapping("create")
    public String renderCreateEventTypeForm(Model model) {
        model.addAttribute("title", "Create Types");
        model.addAttribute(new EventType());
        return "eventTypes/create";
    }

    @PostMapping("create")
    public String processCreateEventTypeForm(@Valid @ModelAttribute EventType eventType,
                                                 Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Type");
            model.addAttribute(new EventType());
            return "eventTypes/create";
        }

        eventTypeRepository.save(eventType);
        return "redirect:";
    }

}
