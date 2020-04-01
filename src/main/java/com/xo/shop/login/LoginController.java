package com.xo.shop.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By willz
 * Date : 2020/3/30
 * Time: 17:23
 */
@Controller
public class LoginController {
    // Login form
    @RequestMapping("/index")
    public String login() {

        return "login";
    }

    // Login form with error
    @RequestMapping("/login-error.html")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login.html";
    }
}
