package pxl.student.be;

import org.springframework.http.HttpRequest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("studentName") String studentName, Model model){
        model.addAttribute("message", "Hello " + studentName.toUpperCase());
        return "helloworld";
    }
}
