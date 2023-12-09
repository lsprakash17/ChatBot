package com.webchatbot.chatbot.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webchatbot.chatbot.helper.ResponseStructure;

@RestController
@RequestMapping("admin")
public class Admincontroler {
	
	@PostMapping("addquerries")
	 public ResponseStructure<> save(@RequestBody)
	 {
		 return  service.save(student);
	 }
	

}
