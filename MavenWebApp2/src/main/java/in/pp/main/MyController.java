package in.pp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @GetMapping("/hellopage")
    public ModelAndView openHellopage() {
        System.out.println("openHellopage() method executed");
        ModelAndView mav = new ModelAndView("hello");
       // mav.setViewName("hello");
        return mav; // Return the ModelAndView object
    }
}
