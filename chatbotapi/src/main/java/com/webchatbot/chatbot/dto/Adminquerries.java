package com.webchatbot.chatbot.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adminquerries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String qs;

	@OneToOne(mappedBy = "adminquerries", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private qsans qsans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQs() {
		return qs;
	}

	public void setQs(String qs) {
		this.qs = qs;
	}

	public qsans getQsans() {
		return qsans;
	}

	public void setQsans(qsans qsans) {
		this.qsans = qsans;
	}

	public Adminquerries( String qs, qsans qsans) {

		this.qs = qs;
		this.qsans = qsans;
	}

	
	
	
	
	
	
	
}
