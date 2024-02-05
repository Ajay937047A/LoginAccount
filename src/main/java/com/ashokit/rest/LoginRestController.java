package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.binding.UserLoginBinding;
import com.ashokit.serivice.LoginUserSerive;

@RestController
public class LoginRestController {
	
	@Autowired
	private LoginUserSerive loginUserSerive;
	
	
	@PostMapping("/userLogin")
	public String userLogin(@RequestBody UserLoginBinding userLoginBinding) {
		return loginUserSerive.loginUser(userLoginBinding);
	}

}
