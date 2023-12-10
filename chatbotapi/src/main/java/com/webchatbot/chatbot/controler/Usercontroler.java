package com.webchatbot.chatbot.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webchatbot.chatbot.helper.ResponseStructure;
import com.webchatbot.chatbot.helper.qsandans;
import com.webchatbot.chatbot.service.Adminservice;

@RestController
@RequestMapping("user")
public class Usercontroler {
	
	@Autowired
	private Adminservice adminservice;
	
	@GetMapping("welcomemessage")
	 public ResponseStructure<List<String>> save()
	 {
		 
		 return adminservice.getAllqs();
	 }
}
