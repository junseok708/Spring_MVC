package com.sparta.spring_mvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/response")
public class ResponseController {


    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson() {
        return new Star("Robbie", 95);
    }

}
