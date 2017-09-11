package com.CurstomerInformation.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.CurstomerInformation.domain.Customer;
import com.CurstomerInformation.service.CustomerService;
import com.CurstomerInformation.service.CustomerServiceImp;


@Controller
//@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerServiceImp customerService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "addCustomer";
	}

	
	@RequestMapping(value = "/addCustomer",method=RequestMethod.POST)
	
	public String getHome(Model model, @Valid Customer customer) {
//		public String getHome(Model model, String firstName,String lastName, String emailAddress, String phoneNumber ) {
//		Customer customer = new Customer(firstName,lastName,emailAddress,phoneNumber);
		System.out.println("my customer name "+customer.getFirstName());
		this.customerService.addCustomer(customer);
		return "redirect:/c";
		
	}
	@RequestMapping("/c")
	public String getHome(Model model) {
	
		
		return "customer";
		
	}

}
//public String getHome(Model model, String firstName,String lastName, String emailAddress, String phoneNumber ) {
//Customer customer = new Customer(firstName,lastName,emailAddress,phoneNumber);