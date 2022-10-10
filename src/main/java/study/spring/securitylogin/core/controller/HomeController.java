package study.spring.securitylogin.core.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String main() {
        return "index";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "loginForm";
    }

    @GetMapping(value = "/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "loginForm";
    }

    @GetMapping(value = "/access-denied")
    public String accessDenied() {
        return "accessDenied";
    }

    @PreAuthorize("hasAnyAuthority('ROLE_USER')")
    @GetMapping(value = "/user-page")
    public String userPage() {
        return "userPage";
    }

    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    @GetMapping(value = "/admin-page")
    public String adminPage() {
        return "adminPage";
    }

    @ResponseBody
    @GetMapping(value = "/auth")
    public Authentication auth() {
        return SecurityContextHolder.getContext().getAuthentication();
    }


}
