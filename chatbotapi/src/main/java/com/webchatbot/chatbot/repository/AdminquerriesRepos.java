package com.webchatbot.chatbot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webchatbot.chatbot.dto.Adminquerries;

public interface AdminquerriesRepos extends JpaRepository<Adminquerries, Integer>
{
	@Query("SELECT a.qs FROM Adminquerries a")
    List<String> findAllQs();
}
