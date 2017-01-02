package com.techm.bluemix.smarterairport.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.techm.bluemix.smarterairport.Services.UserServices;
import com.techm.bluemix.smarterairport.Wrapper.LoginForm;
import com.techm.bluemix.smarterairport.Wrapper.User;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;


@Controller
public class UserController {
	
	@Autowired(required=true)
	private UserServices userServices;
	
	 
	
	@RequestMapping(value= "/signup", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView smartSignup(@RequestParam("USERNAME") String uname, @RequestParam("PASSWORD") String pword,
			@RequestParam("NAME") String name, @RequestParam("EMAIL") String email,@RequestParam("CONTACT") int contact){
		//model.addAttribute("user", new User());
		User u = null;
		u.setUSERNAME(uname);
		u.setPASSWORD(pword);
		u.setEMAIL(email);
		u.setNAME(name);
		u.setCONTACT(contact);
		
		System.out.println("Entered into Controller");
		userServices.signUp(u);
		String message = "User successfully Registered. Please login now";
		return new ModelAndView("index", "message", message);
	}
	
	
	@RequestMapping(value= "/signin", method = RequestMethod.POST)
	public ModelAndView smartSignin(@RequestParam("USERNAME") String uname, @RequestParam("PASSWORD") String pword){
		
		User uw=userServices.getUserByUsername(uname);
		if(uw!=null){
			if(uw.getPASSWORD().equals(pword)){
				return new ModelAndView("home","name",uw.getNAME());
			}	
		}
		return new ModelAndView("index"); 
		
	}
	
	

}
