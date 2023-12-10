package com.webchatbot.chatbot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webchatbot.chatbot.dto.Adminquerries;
import com.webchatbot.chatbot.helper.ResponseStructure;
import com.webchatbot.chatbot.helper.qsandans;
import com.webchatbot.chatbot.repository.AdminquerriesRepos;

@Service
public class Adminservice {
	
	@Autowired
	private AdminquerriesRepos adminquerriesRepos;
	
	
	
	 @Transactional
	public ResponseStructure<String> addAllqsandAns(qsandans qsass) {
		Adminquerries adminquerries = new Adminquerries();
		adminquerries.setQs(qsass.getQuestion());
		adminquerries.setAns(qsass.getAns());
		adminquerriesRepos.save(adminquerries);
		ResponseStructure<String> response = new ResponseStructure<>();
		response.setStatus(HttpStatus.ACCEPTED.value());
		response.setMsg("Successfully Saved");
		response.setData(null);

		return response;

		
	}

	public ResponseStructure<List<String>> getAllqs() {
		// TODO Auto-generated method stub
		List<String> qs=adminquerriesRepos.findAllQs();
		ResponseStructure<List<String>> response = new ResponseStructure<>();
		response.setStatus(HttpStatus.OK.value());
		response.setMsg("fetched  all qs");
		response.setData(qs);
		
		return response;
	}

}
