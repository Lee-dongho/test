package com.overwatch.test;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Transactional
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }



    @GetMapping("/hi")
    public String hi() {
        return "hello";
    }


    @GetMapping("/about")
    public String about() {
        return "about";
    }


    @GetMapping("/mens")
    public String mens() {
        return "mens";
    }

    @GetMapping("/womens")
    public String womens() {
        return "womens";
    }


    @GetMapping("/icons")
    public String icons() {
        return "icons";
    }

    @GetMapping("/typography")
    public String typography() {
        return "typography";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/single")
    public String single() {
        return "single";
    }

    @PostMapping("/search")
    public String search(@RequestParam("search") String search) {
        System.out.println(search+"를 검색하셨습니다. 이와 관련한 결과를 내 놓아라!");

        return "redirect:/";
    }

}
