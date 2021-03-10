package com.el.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * <p>
 *
 * @author Roman.Zhang
 * @description TODO
 * </p >
 * @date 2021/3/7
 */
@Controller
public class ViewTestController {

    @GetMapping("/el")
    public String el(Model model){

        //model中的数据会被放在请求域中 request.setAttribute("a",aa)
        model.addAttribute("msg","你好 el");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
