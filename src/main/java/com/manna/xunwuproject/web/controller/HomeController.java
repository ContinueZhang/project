package com.manna.xunwuproject.web.controller;

import com.manna.xunwuproject.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "manna");
        return "index";
    }

    @GetMapping("get")
    @ResponseBody
    public ApiResponse get(){
        return ApiResponse.ofMessage(200, "success");
    }

    @GetMapping("/404")
    public String notFoundPage() {
        return "404";
    }

    @GetMapping("/403")
    public String accessError() {
        return "403";
    }

    @GetMapping("/500")
    public String internalError() {
        return "500";
    }


    @GetMapping("/logout")
    public String logoutPage() {
        return "logout";
    }
}
