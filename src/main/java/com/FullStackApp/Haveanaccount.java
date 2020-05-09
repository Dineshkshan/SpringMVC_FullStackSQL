package com.FullStackApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Haveanaccount {
	@Autowired
	Login value;
	public Login getValue() {
		return value;
	}

	public void setValue(Login value) {
		this.value = value;
	}

	@RequestMapping(value="/register")
	public String Register()
	{
		System.out.println("The value of a is"+value.a);
		return "Register";
	}

}
