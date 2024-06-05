package in.pp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.pp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @GetMapping("/hellopage")
    public ModelAndView openHellopage() {
        System.out.println("openHellopage() method executed");
        ModelAndView mav = new ModelAndView("hello");
       // mav.setViewName("hello");
        return mav; // Return the ModelAndView object
    }
    
    @GetMapping("/aboutus")
    public String openAboutUsPage() {
    	return "aboutus";
    }
    
    @GetMapping("/form")
    public String openMyFormPage() {
    	return "form";
    }
//    @PostMapping("/submitform")
//    public String handleMyform(HttpServletRequest req) {
//    	
//    	String myname = req.getParameter("name");
//    	String myemail = req.getParameter("email");
//    	String myphone = req.getParameter("Phoneno");
//    	
//    	System.out.println("Name :" +myname);
//    	System.out.println("Email Id :" +myemail);
//    	System.out.println("Phone No :" +myphone);
//    	return "profile";
//    }
    
    
    
//    
//    @PostMapping("/submitform")
//    public String handleMyform(@RequestParam("name")String myname,
//    		@RequestParam("email")String myemail,
//    		@RequestParam("Phoneno")String myphone,
//    		Model model){
//    	
//    	System.out.println("Name :" +myname);
//    	System.out.println("Email Id :" +myemail);
//    	System.out.println("Phone No :" +myphone);
//    	
//    	model.addAttribute("model_name", myname);
//    	model.addAttribute("model_email", myemail);
//    	model.addAttribute("model_phone", myphone);
//    	return "profile";
//    }
    
    
//    @PostMapping("/submitform")
//  public String handleMyform(@RequestParam("name")String myname,
//  		@RequestParam("email")String myemail,
//  		@RequestParam("Phoneno")String myphone,
//  		Model model){
//  	
//  	System.out.println("Name :" +myname);
//  	System.out.println("Email Id :" +myemail);
//  	System.out.println("Phone No :" +myphone);
//  	
//  	User user = new User();
//  	user.setName(myname);
//  	user.setEmail(myemail);
//  	user.setPhoneno(myphone);
//  	
//  	model.addAttribute("model_User", user);
//  	return "profile";
//  }
    
    
    @PostMapping("/submitform")
  public String handleMyform(@ModelAttribute User user){
  	
  	System.out.println("Name :" +user.getName());
  	System.out.println("Email Id :" +user.getEmail());
  	System.out.println("Phone No :" +user.getPhoneno());
  	
  	return "profile";
  }
}
