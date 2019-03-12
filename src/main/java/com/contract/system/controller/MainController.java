package com.contract.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.contract.system.model.Service;
import com.contract.system.model.User;
import com.contract.system.service.SecurityService;
import com.contract.system.service.ServiceService;
import com.contract.system.service.UserService;
import com.contract.system.validator.UserValidator;

@Controller
public class MainController{
	
    @Autowired
    private UserService userService;    
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private SecurityService securityService;
    @Autowired
    private UserValidator userValidator;
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);
        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }
    
    
    /* Employee controller */
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String employee(BindingResult bindingResult, Model model) {
    	
    
        return "redirect:/welcome";
    }
    
    /* Receipt Controller*/
    @RequestMapping(value = "/receipt", method = RequestMethod.GET)
    public String receipt(BindingResult bindingResult, Model model) {
    	  
        return "receipt";
    }
    
    
    
    
    
    /* Invoice Controller */
    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public String invoice( Model model) {
     
        return "invoice";
    }
    
    
    /* Invoice Controller */
    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public String service( Model model) {
    	   
        return "service";
    }
    
    @RequestMapping(value = "/saveService", method = RequestMethod.GET)
    public String saveService( Model model, @ModelAttribute("serviceForm") Service service) {
    	
    serviceService.save(service);
        return "service";
    }
    
    
    
    /* Invoice Controller */
    @RequestMapping(value = "/venue", method = RequestMethod.GET)
    public String venue( Model model) {
    	
    
        return "venue";
    }
    
    
    
    /* Invoice Controller */
    @RequestMapping("/slot")
    public String slot() {
    	
    
        return "slot";
    }
}