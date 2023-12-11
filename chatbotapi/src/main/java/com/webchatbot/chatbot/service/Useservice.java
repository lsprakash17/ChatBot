package com.webchatbot.chatbot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.webchatbot.chatbot.dto.Customerdata;
import com.webchatbot.chatbot.helper.Datacollect;
import com.webchatbot.chatbot.helper.ResponseStructure;
import com.webchatbot.chatbot.helper.SendmailHelper;
import com.webchatbot.chatbot.repository.UserRepository;

@Service
public class Useservice {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	SendmailHelper mail;

	public ResponseStructure<String> savedata(Datacollect datacollect) {
		Customerdata customerdata=new Customerdata();
		customerdata.setName(datacollect.getName());
		customerdata.setEmail(datacollect.getEmail());
		customerdata.setPhNo(datacollect.getPhNo());
		repository.save(customerdata);
		ResponseStructure<String> response =new ResponseStructure<>();
		if(mail.sendLink(datacollect))
		{
		response.setStatus(HttpStatus.ACCEPTED.OK.value());
		response.setMsg("data saved");
		response.setData("happy to help we wll reach you");
		return response;
	}
		else
			return null;
			

}
}