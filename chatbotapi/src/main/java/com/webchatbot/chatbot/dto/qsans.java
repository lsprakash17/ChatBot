package com.webchatbot.chatbot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class qsans {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ans;
	@OneToOne
	@JoinColumn(name = "adminquerries_id", referencedColumnName = "id")
	private Adminquerries adminquerries;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Adminquerries getAdminquerries() {
		return adminquerries;
	}
	public void setAdminquerries(Adminquerries adminquerries) {
		this.adminquerries = adminquerries;
	}
	public qsans(String ans, Adminquerries adminquerries) {
		this.ans = ans;
		this.adminquerries = adminquerries;
	}
	
	
	

}
