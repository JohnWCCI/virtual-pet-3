package org.wecancodeit.virtualpets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.virtualpets.services.AdopterService;

@Controller
@RequestMapping("/api")
public class AdopterController {
    private AdopterService service;

    public AdopterController(AdopterService service) {
        this.service = service;
    }

    @GetMapping({"/contact/{id}","/Contact/{id}"})
    public String getContactInfo(@PathVariable Long id, Model model){
        model.addAttribute("contactInfo", service.findContactInfo(id));
        return "contactView";
    }
    
}
