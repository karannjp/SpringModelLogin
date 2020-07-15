package com.karan;

//import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String userLogin(@RequestParam("name")String uname,
                            @RequestParam("pass")String pass  , Model model){
/*
   String uname= request.getParameter("name");
    String pass=request.getParameter("pass");
*/
if( pass.equals("karan")){


        String message="hello "+uname;
        model.addAttribute("message",message);
    return  "loginpage";
}
else {
    String msg="Sorry "+ uname+". You entered an incorrect password";
    model.addAttribute("message", msg);
    return "errorpage";

}



    }



}
