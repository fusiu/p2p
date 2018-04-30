package com.fusiu.p2p.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class P2pWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2pWebsiteApplication.class, args);
	}

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(){
		return "home";
	}
}
