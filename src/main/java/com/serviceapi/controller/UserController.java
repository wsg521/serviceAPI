package com.serviceapi.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.serviceapi.model.User;

@Controller
@Scope("prototype")
@RequestMapping(value = "/user") 
public class UserController extends BaseController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
	public User getUserById() {
		User user = new User();
		user.setName("UserController");
		return user;
	}
	
	@RequestMapping(value = "/index")
    public String index() {
        return "Index Page";
    }
	
	@RequestMapping(value = "/{username}")
	public String userProfile(@PathVariable("username") String username) {
	    return String.format("user %s", username);
	}

	@RequestMapping(value = "/update/{id}")
	public String post(@PathVariable("id") int id) {
	    return String.format("post %d", id);
	}
	
	@RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
	
}
