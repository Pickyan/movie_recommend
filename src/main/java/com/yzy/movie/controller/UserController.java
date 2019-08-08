package com.yzy.movie.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yzy.movie.entity.UserTest;
import com.yzy.movie.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping("/findOneUser")
	public String findOneUser(String id,HttpServletRequest request) {
		
		UserTest userTest = userService.findOne(id);

		request.setAttribute("u_id", userTest.getId());
		request.setAttribute("u_passwd", userTest.getPassword());
		
		return "success.jsp";
	}
}
