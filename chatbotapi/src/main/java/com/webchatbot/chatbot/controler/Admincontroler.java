package com.webchatbot.chatbot.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webchatbot.chatbot.helper.ResponseStructure;
import com.webchatbot.chatbot.helper.qsandans;
import com.webchatbot.chatbot.service.Adminservice;

@RestController
@RequestMapping("admin")
public class Admincontroler {
	
	@Autowired
	private Adminservice adminservice;
	
	@PostMapping("addquerries")
	 public ResponseStructure<String> save(@RequestBody qsandans qsas)
	 {
		 
		 return adminservice.addAllqsandAns(qsas);
	 }
	

}

