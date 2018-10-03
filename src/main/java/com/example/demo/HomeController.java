package com.example.demo;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController {

    @RequestMapping(value="/", method = {GET, POST})
	public String menu() {
	    return "index";
	}

}
