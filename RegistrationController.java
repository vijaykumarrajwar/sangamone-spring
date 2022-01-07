package com.example.SmallWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@Autowired
	 userRepo repo;
	@RequestMapping("/regform")
	public String register() {
		return "operation";
		
	}
//
//	@RequestMapping("/userDetail")
//	public ModelAndView userInfo(UserRegister reg) {
//		System.out.println("i am detaial "  +  reg.getEmail());
//		       ModelMap model =new ModelMap();
//	        	model.addAttribute("email", reg.getEmail());
//				model.addAttribute("name",reg.getUName());
//				model.addAttribute("psw", reg.getPsw());
//				model.addAttribute("pswrepeat", reg.getPswrepeat());
//				ModelAndView mv=new ModelAndView("userdetail");
//					mv.addObject("regObj",model);
//					return mv;
//		
//	}

                              
                          @RequestMapping("/userDetails")
                         public String userInfo(UserRegister reg) {
                        	 repo.save(reg);
                          return "operation";
                          }

                          @RequestMapping("/operation")
                         public String operation() {
                          return "operation";
                          
                          }
                          }