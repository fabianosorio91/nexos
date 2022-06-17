package com.auto.nexos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.nexos.repository.mercanciaRepository;

@Service
public class mercanciaService {
	
	@Autowired
	private mercanciaRepository mercanciaRepository;

}
