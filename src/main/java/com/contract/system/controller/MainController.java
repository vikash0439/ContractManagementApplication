package com.contract.system.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contract.system.model.Booking;
import com.contract.system.model.Contract;
import com.contract.system.model.Customer;
import com.contract.system.model.Performance;
import com.contract.system.model.Service;
import com.contract.system.model.Slot;
import com.contract.system.model.Tax;
import com.contract.system.model.User;
import com.contract.system.model.Venue;
import com.contract.system.service.BookingService;
import com.contract.system.service.ContractService;
import com.contract.system.service.CustomerService;
import com.contract.system.service.PerformanceService;
import com.contract.system.service.SecurityService;
import com.contract.system.service.ServiceService;
import com.contract.system.service.SlotService;
import com.contract.system.service.TaxService;
import com.contract.system.service.UserService;
import com.contract.system.service.VenueService;
import com.contract.system.validator.UserValidator;

@Controller
public class MainController{
	
    @Autowired private UserService userService;    
    @Autowired private ServiceService serviceService;
    @Autowired private SlotService slotService;
    @Autowired private VenueService venueService;
    @Autowired private TaxService taxService;
    @Autowired private CustomerService customerService;
    @Autowired private ContractService contractService;
    @Autowired private SecurityService securityService;
    @Autowired private UserValidator userValidator;
    @Autowired private PerformanceService performanceService;
    @Autowired private BookingService bookingService;
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model){
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
    	Date date= new Date();
    	model.addAttribute("day", new SimpleDateFormat("EEEE").format(date));
    	model.addAttribute("date", new SimpleDateFormat("dd-MM-yyyy '|' hh:mm:ss a '|'  zzz").format(date));
    	model.addAttribute("location", "Delhi, India");
    	
    	model.addAttribute("noofCustomer", customerService.getTotal());
    	model.addAttribute("noofContract", contractService.getTotal());
    	model.addAttribute("revenue", contractService.getSumAmount());
    	model.addAttribute("invoicecount", null);
        return "welcome";
    }
    
    /* Contract Controller */
    @RequestMapping("/contract")
    public String contract(HttpServletRequest request) {
    	request.setAttribute("allcustomer", customerService.findName());  
    	request.setAttribute("allservices", serviceService.findName());
        return "contract";
    }
    
    @RequestMapping(value = "/save-contract", method = RequestMethod.GET)
    public String saveContract( Model model, @ModelAttribute Contract contract, @ModelAttribute Performance performance, @ModelAttribute Booking booking, @RequestParam String cname) {  
       
    	System.out.println(cname);
    	Customer customer = customerService.findCustomer(cname);
    	System.out.println("Customer : " +customer);
    	System.out.println("Performance : "+performance);
    	
    	contract.setCustomer(customer);
    	
    	performance.setContract(contract);
    	performanceService.save(performance);
    	
    	booking.setContract(contract);
    	bookingService.save(booking);
    	
		
	  //  contract.setBookings(bookings);
	  //   contract.setPerformances(performances);
    	contractService.save(contract);   	
        return "contract";
    }
    
    @RequestMapping("/booking")
    public String booking(HttpServletRequest request) {
    	request.setAttribute("allcustomer", customerService.getCustomer());    
        return "booking";
    }
    
    @ResponseBody
    @RequestMapping(value = "/searchService", method = RequestMethod.POST)
    public String searchService(HttpServletRequest request) {
    	String s = "abcdef";
		return s; 	            
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
    
    
    /* Service Controller */
    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public String service( Model model, HttpServletRequest request){
    	request.setAttribute("allservice", serviceService.getService()); 
    	request.setAttribute("allvenue", venueService.findVenue());
        request.setAttribute("allslot", slotService.findSlot());
        request.setAttribute("allsaccode", taxService.getAllSaccode());
        return "service";
    }
    
    @RequestMapping(value = "/saveService", method = RequestMethod.GET)
    public String saveService( Model model, @ModelAttribute("serviceForm") Service service) {  	
        serviceService.save(service);
        return "service";
    }
    
    
    
    /* Invoice Controller */
    @RequestMapping(value = "/venue", method = RequestMethod.GET)
    public String venue( Model model, HttpServletRequest request) {
    	request.setAttribute("allvenue", venueService.getAllVenue());
        
        return "venue";
    }  
    @RequestMapping(value = "/saveVenue", method = RequestMethod.GET)
    public String saveVenue( Model model, @ModelAttribute("venueForm") Venue venue) {  	
    	venueService.save(venue);
        return "venue";
    }
        
    /* Invoice Controller */
    @RequestMapping("/slot")
    public String slot(HttpServletRequest request) {
    	request.setAttribute("allslot", slotService.getSlot());   
        return "slot";
    }
    
    @RequestMapping(value = "/saveSlot", method = RequestMethod.GET)
    public String saveSlot( Model model, @ModelAttribute("slotForm") Slot slot) {  	
        slotService.save(slot);
        return "slot";
    }
    
    
    
    /* Tax Controller */
    @RequestMapping("/tax")
    public String tax(HttpServletRequest request) {
    	request.setAttribute("alltax", taxService.getTax());
    
        return "tax";
    }
    
    @RequestMapping(value = "/saveTax", method = RequestMethod.GET)
    public String saveTax( Model model, @ModelAttribute("taxForm") Tax tax) {  	
    	taxService.save(tax);
        return "tax";
    }
    
    
    
    /* Customer Controller */
    @RequestMapping("/customer")
    public String customer(HttpServletRequest request) {
    	request.setAttribute("allcustomer", customerService.getCustomer());
    
        return "customer";
    }
    
    @RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    public String saveCustomer( Model model, @ModelAttribute("customerForm") Customer customer) {  	
    	customerService.save(customer);
        return "customer";
    }
}