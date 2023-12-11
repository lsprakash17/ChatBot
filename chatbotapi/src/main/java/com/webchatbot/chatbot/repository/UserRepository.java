package com.webchatbot.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webchatbot.chatbot.dto.Customerdata;

public interface UserRepository extends JpaRepository<Customerdata, Integer>
{

}
