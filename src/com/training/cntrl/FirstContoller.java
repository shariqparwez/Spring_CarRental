package com.training.cntrl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.CarRental;

@Controller
public class FirstContoller {
	@RequestMapping("/")
	public String initApp(){
		return "index";
	}
	
	@Autowired
	CarRental carRent;
	
	@Autowired
	private ModelAndView mdl;
	
	@ModelAttribute("carTypes")
	public String[] getCarTypes(){
		return new String[]{"Sedan NAC","Sedan AC","HatchBack AC","Luxury Car"};
	}

	@RequestMapping(name="/AddRequest",method=RequestMethod.GET)
	public ModelAndView initCarRental(){
		mdl.setViewName("CarRent");
		mdl.addObject("command",carRent);
		return mdl;
	}
	
	@RequestMapping(name="/AddRequest",method=RequestMethod.POST)
	public String onSubmit(@ModelAttribute("req") CarRental carRent,BindingResult result){
		String nextStep = "Welcome";
		if(result.hasErrors()){
			nextStep="CarRental";
		}
		
		//return "Welcome";
		return "nextStep";
	}

	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("userName") String name, Model mdl){
		mdl.addAttribute("prevBooking", "previous booking was made on Friday, the 13th");
		return "Welcome";
	}
}
